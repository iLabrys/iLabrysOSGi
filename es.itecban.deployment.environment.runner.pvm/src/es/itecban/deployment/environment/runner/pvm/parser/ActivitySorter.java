/*******************************************************************************
 * Copyright 2014 Indra
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package es.itecban.deployment.environment.runner.pvm.parser;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;
import es.itecban.deployment.model.deployment.plan.ActivityType;
import es.itecban.deployment.model.deployment.plan.PlanFactory;

public class ActivitySorter {

	public static EList<ActivityType> sort(EList<ActivityType> activities) {
		EList<ActivityType> list = new BasicEList<ActivityType>();
		EList<ActivityType> acts = new BasicEList<ActivityType>();
		for (ActivityType activity : activities) {
			ActivityType act = PlanFactory.eINSTANCE.createDeploymentActivityType();
			act.setActivityId(activity.getActivityId());
			EList<Integer> deps = activity.getDependency();
			for (Integer dep : deps) {
				act.getDependency().add(dep.intValue());
			}
			acts.add(act);
		}
		while (!acts.isEmpty()) {
			for (int i = 0; i < acts.size(); i++) {
				ActivityType current = acts.get(i);
				if (current.getDependency().isEmpty()) {
					for (ActivityType activity: activities) {
						if (activity.getActivityId() == current.getActivityId()) {
							list.add(activity);
						}
					}
					for (int j = 0; j < acts.size(); j++) {
						ActivityType act = acts.get(j);
						EList<Integer> deps = act.getDependency();
						if (deps.contains(current.getActivityId())) {
							int index = deps.indexOf(current.getActivityId());
							deps.remove(index);
						}
					}
					acts.remove(current);
				}
			}
		}
		return list;
	}
	
	public static EList<ActivityType> setOrder(EList <ActivityType> activities, List<Integer> order) throws Exception {
		if (order.size() != activities.size()) {
			throw new Exception("Order not valid");
		}
		EList<ActivityType> ordered = new BasicEList<ActivityType>();
		for (int i = 0; i < order.size(); i++) {
			int orderId = order.get(i);
			boolean found = false;
			for (int j = 0; j < activities.size(); j++) {
				ActivityType activity = activities.get(j);
				if (activity.getActivityId() == orderId) {
					ordered.add(i, activity);
					found = true;
				}
			}
			if (!found) {
				throw new Exception("Order not valid");
			}
		}
		return ordered;
	}
	
}
