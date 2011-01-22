/**
 *     Copyright 2011 Membase, Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.membase.jmembase.http;

/**
 * The web server will fire this callback whenever a new request
 * arrives on the wire...
 *
 * @author Trond Norbye
 */
public interface HttpRequestHandler {
    /**
     * Handle the given http request. The server may wish to cache
     * the request and send chuncs at a later time..
     *
     * @param request the object representing the request
     */
    public void handleHttpRequest(HttpRequest request);
}
