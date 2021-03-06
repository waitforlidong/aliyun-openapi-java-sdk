/*
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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SubmitMCJobRequest extends RpcAcsRequest<SubmitMCJobResponse> {
	
	public SubmitMCJobRequest() {
		super("Mts", "2014-06-18", "SubmitMCJob", "mts");
	}

	private String userData;

	private Long resourceOwnerId;

	private String images;

	private String texts;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String video;

	private Long ownerId;

	private String censorConfig;

	private String pipelineId;

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
		if(images != null){
			putQueryParameter("Images", images);
		}
	}

	public String getTexts() {
		return this.texts;
	}

	public void setTexts(String texts) {
		this.texts = texts;
		if(texts != null){
			putQueryParameter("Texts", texts);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
		if(video != null){
			putQueryParameter("Video", video);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getCensorConfig() {
		return this.censorConfig;
	}

	public void setCensorConfig(String censorConfig) {
		this.censorConfig = censorConfig;
		if(censorConfig != null){
			putQueryParameter("CensorConfig", censorConfig);
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	@Override
	public Class<SubmitMCJobResponse> getResponseClass() {
		return SubmitMCJobResponse.class;
	}

}
