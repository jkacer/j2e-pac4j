/*
  Copyright 2013 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.j2e.configuration;

import org.pac4j.core.client.Clients;

/**
 * This class is a factory to build the clients.
 * 
 * @author Jerome Leleu
 * @since 1.0.0
 */
public interface ClientsFactory {
    
    /**
     * Build all the clients.
     * 
     * @return all the clients.
     */
    Clients build();
}
