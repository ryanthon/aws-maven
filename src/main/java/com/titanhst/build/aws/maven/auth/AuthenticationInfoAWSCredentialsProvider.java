/*
 * Copyright 2010-2019 the original author or authors.
 *
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
 */

package com.titanhst.build.aws.maven.auth;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import org.apache.maven.wagon.authentication.AuthenticationInfo;


public final class AuthenticationInfoAWSCredentialsProvider implements AWSCredentialsProvider {

    private final AuthenticationInfo authenticationInfo;

    public AuthenticationInfoAWSCredentialsProvider(AuthenticationInfo authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
    }

    @Override
    public AWSCredentials getCredentials() {
        return this.authenticationInfo != null ? new AuthenticationInfoAWSCredentials(this.authenticationInfo) : null;
    }

    @Override
    public void refresh() {
    }
}
