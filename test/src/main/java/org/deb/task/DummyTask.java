/**
 * Copyright 2015-2016 Debmalya Jash
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.deb.task;

/**
 * @author debmalyajash
 *
 */
public class DummyTask {
	/**
	 * This is a dummy task, just return an object.
	 * It has a delay of 1 mili second and 1 nano second.
	 * @return
	 */
	public Object execute(){
		try {
			Thread.sleep(1, 1);
		} catch(InterruptedException ie){
			
		}finally {
		
		}
		return new Object();
	}
}
