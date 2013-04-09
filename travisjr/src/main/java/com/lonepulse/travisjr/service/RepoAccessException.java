package com.lonepulse.travisjr.service;

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


import com.lonepulse.travisjr.TravisJrRuntimeException;
import com.lonepulse.travisjr.model.Repo;

/**
 * <p>This exception is thrown when a {@link Repo} cannot be accessed via 
 * the endpoint.
 * 
 * @version 1.1.0
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public class RepoAccessException extends TravisJrRuntimeException {


	private static final long serialVersionUID = 2716924294460417858L;

	
	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException()}.
	 */
	public RepoAccessException() {
		
		this("Failed to access repo(s).");
	}

	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException(String)}.
	 */
	public RepoAccessException(String detailMessage) {
		super(detailMessage);
	}

	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException(Throwable)}.
	 */
	public RepoAccessException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * <p>See {@link TravisJrRuntimeException#TravisJrRuntimeException(String, Throwable)}.
	 */
	public RepoAccessException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
	}
}
