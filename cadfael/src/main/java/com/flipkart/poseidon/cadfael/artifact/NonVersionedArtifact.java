/*
 * Copyright 2017 Flipkart Internet, pvt ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flipkart.poseidon.cadfael.artifact;

/**
 * Created by shrey.garg on 02/09/17.
 */
public class NonVersionedArtifact {
    private final String groupId;
    private final String artifactId;

    public NonVersionedArtifact() {
        this("", "");
    }

    public NonVersionedArtifact(String groupId, String artifactId) {
        this.groupId = groupId;
        this.artifactId = artifactId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonVersionedArtifact)) return false;

        NonVersionedArtifact that = (NonVersionedArtifact) o;

        if (!groupId.equals(that.groupId)) return false;
        return artifactId.equals(that.artifactId);
    }

    @Override
    public int hashCode() {
        int result = groupId.hashCode();
        result = 31 * result + artifactId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("groupId='").append(groupId).append('\'');
        sb.append(", artifactId='").append(artifactId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
