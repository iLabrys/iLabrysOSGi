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
package es.itecban.deployment.security.client.ws;

import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationException;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.security.providers.AuthenticationProvider;
import org.springframework.security.userdetails.UserDetails;

public class AuthenticationManager implements
		org.springframework.security.providers.AuthenticationProvider,
		org.springframework.security.AuthenticationManager {
	
	private AuthenticationProvider authenticationManager;

	@Override
	public Authentication authenticate(Authentication authentication) {
		return this.authenticationManager.authenticate(authentication);
	}

	public AuthenticationProvider getAuthenticationManager() {
		return authenticationManager;
	}

	public void setAuthenticationManager(
			AuthenticationProvider authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	@Override
	public boolean supports(Class authentication) {
		return this.authenticationManager.supports(authentication);
	}

	public static String getUserName() {
		Object obj = SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		String username = "anonymous";
		if (obj != null)
			if (obj instanceof UserDetails) {
				username = ((UserDetails) obj).getUsername();
			} else {
				username = obj.toString();
			}
		return username;
	}
}
