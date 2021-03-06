package com.lonepulse.travisjr;

/*
 * #%L
 * Travis Jr.
 * %%
 * Copyright (C) 2013 Lonepulse
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/**
 * <p>This exception is thrown due to erroneous arguments which are supplied 
 * to a constructor or a method.
 * 
 * @version 1.1.0
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public class IllegalArgumentException extends TravisJrRuntimeException {

	
	private static final long serialVersionUID = -8827610070763463270L;
	

	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException()}.
	 * 
	 * @since 1.1.0
	 */
	public IllegalArgumentException() {}

	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException(String)}.
	 * 
	 * @since 1.1.0
	 */
	public IllegalArgumentException(String detailMessage) {
		
		super(detailMessage);
	}

	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException(Throwable)}.
	 * 
	 * @since 1.1.0
	 */
	public IllegalArgumentException(Throwable throwable) {
		
		super(throwable);
	}

	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException(String, Throwable)}.
	 * 
	 * @since 1.1.0
	 */
	public IllegalArgumentException(String detailMessage, Throwable throwable) {
		
		super(detailMessage, throwable);
	}
}
