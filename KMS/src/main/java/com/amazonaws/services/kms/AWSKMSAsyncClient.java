package com.amazonaws.services.kms;

import com.amazonaws.services.kms.model.CancelKeyDeletionRequest;
import com.amazonaws.services.kms.model.CancelKeyDeletionResult;
import com.amazonaws.services.kms.model.CreateAliasRequest;
import com.amazonaws.services.kms.model.CreateAliasResult;
import com.amazonaws.services.kms.model.CreateGrantRequest;
import com.amazonaws.services.kms.model.CreateGrantResult;
import com.amazonaws.services.kms.model.CreateKeyRequest;
import com.amazonaws.services.kms.model.CreateKeyResult;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.kms.model.DecryptResult;
import com.amazonaws.services.kms.model.DeleteAliasRequest;
import com.amazonaws.services.kms.model.DeleteAliasResult;
import com.amazonaws.services.kms.model.DeleteImportedKeyMaterialRequest;
import com.amazonaws.services.kms.model.DeleteImportedKeyMaterialResult;
import com.amazonaws.services.kms.model.DescribeKeyRequest;
import com.amazonaws.services.kms.model.DescribeKeyResult;
import com.amazonaws.services.kms.model.DisableKeyRequest;
import com.amazonaws.services.kms.model.DisableKeyResult;
import com.amazonaws.services.kms.model.DisableKeyRotationRequest;
import com.amazonaws.services.kms.model.DisableKeyRotationResult;
import com.amazonaws.services.kms.model.EnableKeyRequest;
import com.amazonaws.services.kms.model.EnableKeyResult;
import com.amazonaws.services.kms.model.EnableKeyRotationRequest;
import com.amazonaws.services.kms.model.EnableKeyRotationResult;
import com.amazonaws.services.kms.model.EncryptRequest;
import com.amazonaws.services.kms.model.EncryptResult;
import com.amazonaws.services.kms.model.GenerateDataKeyRequest;
import com.amazonaws.services.kms.model.GenerateDataKeyResult;
import com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextRequest;
import com.amazonaws.services.kms.model.GenerateDataKeyWithoutPlaintextResult;
import com.amazonaws.services.kms.model.GenerateRandomRequest;
import com.amazonaws.services.kms.model.GenerateRandomResult;
import com.amazonaws.services.kms.model.GetKeyPolicyRequest;
import com.amazonaws.services.kms.model.GetKeyPolicyResult;
import com.amazonaws.services.kms.model.GetKeyRotationStatusRequest;
import com.amazonaws.services.kms.model.GetKeyRotationStatusResult;
import com.amazonaws.services.kms.model.GetParametersForImportRequest;
import com.amazonaws.services.kms.model.GetParametersForImportResult;
import com.amazonaws.services.kms.model.ImportKeyMaterialRequest;
import com.amazonaws.services.kms.model.ImportKeyMaterialResult;
import com.amazonaws.services.kms.model.ListAliasesRequest;
import com.amazonaws.services.kms.model.ListAliasesResult;
import com.amazonaws.services.kms.model.ListGrantsRequest;
import com.amazonaws.services.kms.model.ListGrantsResult;
import com.amazonaws.services.kms.model.ListKeyPoliciesRequest;
import com.amazonaws.services.kms.model.ListKeyPoliciesResult;
import com.amazonaws.services.kms.model.ListKeysRequest;
import com.amazonaws.services.kms.model.ListKeysResult;
import com.amazonaws.services.kms.model.ListResourceTagsRequest;
import com.amazonaws.services.kms.model.ListResourceTagsResult;
import com.amazonaws.services.kms.model.ListRetirableGrantsRequest;
import com.amazonaws.services.kms.model.ListRetirableGrantsResult;
import com.amazonaws.services.kms.model.PutKeyPolicyRequest;
import com.amazonaws.services.kms.model.PutKeyPolicyResult;
import com.amazonaws.services.kms.model.ReEncryptRequest;
import com.amazonaws.services.kms.model.ReEncryptResult;
import com.amazonaws.services.kms.model.RetireGrantRequest;
import com.amazonaws.services.kms.model.RetireGrantResult;
import com.amazonaws.services.kms.model.RevokeGrantRequest;
import com.amazonaws.services.kms.model.RevokeGrantResult;
import com.amazonaws.services.kms.model.ScheduleKeyDeletionRequest;
import com.amazonaws.services.kms.model.ScheduleKeyDeletionResult;
import com.amazonaws.services.kms.model.TagResourceRequest;
import com.amazonaws.services.kms.model.TagResourceResult;
import com.amazonaws.services.kms.model.UntagResourceRequest;
import com.amazonaws.services.kms.model.UntagResourceResult;
import com.amazonaws.services.kms.model.UpdateAliasRequest;
import com.amazonaws.services.kms.model.UpdateAliasResult;
import com.amazonaws.services.kms.model.UpdateKeyDescriptionRequest;
import com.amazonaws.services.kms.model.UpdateKeyDescriptionResult;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.nr.instrumentation.kms.NRAsyncHandler;
import com.amazonaws.handlers.AsyncHandler;

import java.util.concurrent.Future;

@Weave
public abstract class AWSKMSAsyncClient {

	@Trace
    public Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(CancelKeyDeletionRequest request,
            AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler) {
		String segmentName = "cancelKeyDeletion";
		NRAsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> wrapper = new NRAsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
	}

	@Trace
    public Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request,
            AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {
		String segmentName = "createAliasAsync";
		NRAsyncHandler<CreateAliasRequest, CreateAliasResult> wrapper = new NRAsyncHandler<CreateAliasRequest, CreateAliasResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<CreateGrantResult> createGrantAsync(CreateGrantRequest request,
            AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler) {
		String segmentName = "createGrant";
		NRAsyncHandler<CreateGrantRequest, CreateGrantResult> wrapper = new NRAsyncHandler<CreateGrantRequest, CreateGrantResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<CreateKeyResult> createKeyAsync(CreateKeyRequest request,
            AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {
		String segmentName = "createKey";
		NRAsyncHandler<CreateKeyRequest, CreateKeyResult> wrapper = new NRAsyncHandler<CreateKeyRequest, CreateKeyResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<DecryptResult> decryptAsync(DecryptRequest request,
            AsyncHandler<DecryptRequest, DecryptResult> asyncHandler) {
		String segmentName = "decrypt";
		NRAsyncHandler<DecryptRequest, DecryptResult> wrapper = new NRAsyncHandler<DecryptRequest, DecryptResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request,
            AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {
		String segmentName = "deleteAlias";
		NRAsyncHandler<DeleteAliasRequest, DeleteAliasResult> wrapper = new NRAsyncHandler<DeleteAliasRequest, DeleteAliasResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<DeleteImportedKeyMaterialResult> deleteImportedKeyMaterialAsync(DeleteImportedKeyMaterialRequest request,
            AsyncHandler<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResult> asyncHandler) {
		String segmentName = "deleteImportedKeyMaterial";
		NRAsyncHandler<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResult> wrapper = new NRAsyncHandler<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<DescribeKeyResult> describeKeyAsync(DescribeKeyRequest request,
            AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler) {
		String segmentName = "describeKey";
		NRAsyncHandler<DescribeKeyRequest, DescribeKeyResult> wrapper = new NRAsyncHandler<DescribeKeyRequest, DescribeKeyResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<DisableKeyResult> disableKeyAsync(DisableKeyRequest request,
            AsyncHandler<DisableKeyRequest, DisableKeyResult> asyncHandler) {
		String segmentName = "disableKey";
		NRAsyncHandler<DisableKeyRequest, DisableKeyResult> wrapper = new NRAsyncHandler<DisableKeyRequest, DisableKeyResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<DisableKeyRotationResult> disableKeyRotationAsync(DisableKeyRotationRequest request,
            AsyncHandler<DisableKeyRotationRequest, DisableKeyRotationResult> asyncHandler) {
		String segmentName = "disableKeyRotation";
		NRAsyncHandler<DisableKeyRotationRequest, DisableKeyRotationResult> wrapper = new NRAsyncHandler<DisableKeyRotationRequest, DisableKeyRotationResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<EnableKeyResult> enableKeyAsync(EnableKeyRequest request,
            AsyncHandler<EnableKeyRequest, EnableKeyResult> asyncHandler) {
		String segmentName = "enableKey";
		NRAsyncHandler<EnableKeyRequest, EnableKeyResult> wrapper = new NRAsyncHandler<EnableKeyRequest, EnableKeyResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<EnableKeyRotationResult> enableKeyRotationAsync(EnableKeyRotationRequest request,
            AsyncHandler<EnableKeyRotationRequest, EnableKeyRotationResult> asyncHandler) {
		String segmentName = "enableKeyRotation";
		NRAsyncHandler<EnableKeyRotationRequest, EnableKeyRotationResult> wrapper = new NRAsyncHandler<EnableKeyRotationRequest, EnableKeyRotationResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<EncryptResult> encryptAsync(EncryptRequest request,
            AsyncHandler<EncryptRequest, EncryptResult> asyncHandler) {
		String segmentName = "encrypt";
		NRAsyncHandler<EncryptRequest, EncryptResult> wrapper = new NRAsyncHandler<EncryptRequest, EncryptResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<GenerateDataKeyResult> generateDataKeyAsync(GenerateDataKeyRequest request,
            AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler) {
		String segmentName = "generateDataKey";
		NRAsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> wrapper = new NRAsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest request,
            AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler) {
		String segmentName = "generateDataKeyWithoutPlaintext";
		NRAsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> wrapper = new NRAsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<GenerateRandomResult> generateRandomAsync(GenerateRandomRequest request,
            AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {
		String segmentName = "generateRandom";
		NRAsyncHandler<GenerateRandomRequest, GenerateRandomResult> wrapper = new NRAsyncHandler<GenerateRandomRequest, GenerateRandomResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<GetKeyPolicyResult> getKeyPolicyAsync(GetKeyPolicyRequest request,
            AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler) {
		String segmentName = "getKeyPolicy";
		NRAsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> wrapper = new NRAsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(GetKeyRotationStatusRequest request,
            AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler) {
		String segmentName = "getKeyRotationStatus";
		NRAsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> wrapper = new NRAsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest request,
            AsyncHandler<GetParametersForImportRequest, GetParametersForImportResult> asyncHandler) {
		String segmentName = "getParametersForImport";
		NRAsyncHandler<GetParametersForImportRequest, GetParametersForImportResult> wrapper = new NRAsyncHandler<GetParametersForImportRequest, GetParametersForImportResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ImportKeyMaterialResult> importKeyMaterialAsync(ImportKeyMaterialRequest request,
            AsyncHandler<ImportKeyMaterialRequest, ImportKeyMaterialResult> asyncHandler) {
		String segmentName = "importKeyMaterial";
		NRAsyncHandler<ImportKeyMaterialRequest, ImportKeyMaterialResult> wrapper = new NRAsyncHandler<ImportKeyMaterialRequest, ImportKeyMaterialResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request,
            AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {
		String segmentName = "listAliases";
		NRAsyncHandler<ListAliasesRequest, ListAliasesResult> wrapper = new NRAsyncHandler<ListAliasesRequest, ListAliasesResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ListGrantsResult> listGrantsAsync(ListGrantsRequest request,
            AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler) {
		String segmentName = "listGrants";
		NRAsyncHandler<ListGrantsRequest, ListGrantsResult> wrapper = new NRAsyncHandler<ListGrantsRequest, ListGrantsResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ListKeyPoliciesResult> listKeyPoliciesAsync(ListKeyPoliciesRequest request,
            AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler) {
		String segmentName = "listKeyPolicies";
		NRAsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> wrapper = new NRAsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ListKeysResult> listKeysAsync(ListKeysRequest request,
            AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {
		String segmentName = "listKeys";
		NRAsyncHandler<ListKeysRequest, ListKeysResult> wrapper = new NRAsyncHandler<ListKeysRequest, ListKeysResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ListResourceTagsResult> listResourceTagsAsync(ListResourceTagsRequest request,
            AsyncHandler<ListResourceTagsRequest, ListResourceTagsResult> asyncHandler) {
		String segmentName = "listResourceTags";
		NRAsyncHandler<ListResourceTagsRequest, ListResourceTagsResult> wrapper = new NRAsyncHandler<ListResourceTagsRequest, ListResourceTagsResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ListRetirableGrantsResult> listRetirableGrantsAsync(ListRetirableGrantsRequest request,
            AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler) {
		String segmentName = "listRetirableGrants";
		NRAsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> wrapper = new NRAsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<PutKeyPolicyResult> putKeyPolicyAsync(PutKeyPolicyRequest request,
            AsyncHandler<PutKeyPolicyRequest, PutKeyPolicyResult> asyncHandler) {
		String segmentName = "putKeyPolicy";
		NRAsyncHandler<PutKeyPolicyRequest, PutKeyPolicyResult> wrapper = new NRAsyncHandler<PutKeyPolicyRequest, PutKeyPolicyResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ReEncryptResult> reEncryptAsync(ReEncryptRequest request,
            AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler) {
		String segmentName = "reEncrypt";
		NRAsyncHandler<ReEncryptRequest, ReEncryptResult> wrapper = new NRAsyncHandler<ReEncryptRequest, ReEncryptResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<RetireGrantResult> retireGrantAsync(RetireGrantRequest request,
            AsyncHandler<RetireGrantRequest, RetireGrantResult> asyncHandler) {
		String segmentName = "retireGrant";
		NRAsyncHandler<RetireGrantRequest, RetireGrantResult> wrapper = new NRAsyncHandler<RetireGrantRequest, RetireGrantResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<RevokeGrantResult> revokeGrantAsync(RevokeGrantRequest request,
            AsyncHandler<RevokeGrantRequest, RevokeGrantResult> asyncHandler) {
		String segmentName = "revokeGrant";
		NRAsyncHandler<RevokeGrantRequest, RevokeGrantResult> wrapper = new NRAsyncHandler<RevokeGrantRequest, RevokeGrantResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(ScheduleKeyDeletionRequest request,
            AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler) {
		String segmentName = "scheduleKeyDeletion";
		NRAsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> wrapper = new NRAsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
		String segmentName = "tagResource";
		NRAsyncHandler<TagResourceRequest, TagResourceResult> wrapper = new NRAsyncHandler<TagResourceRequest, TagResourceResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
		String segmentName = "untagResource";
		NRAsyncHandler<UntagResourceRequest, UntagResourceResult> wrapper = new NRAsyncHandler<UntagResourceRequest, UntagResourceResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request,
            AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {
		String segmentName = "updateAliasAsync";
		NRAsyncHandler<UpdateAliasRequest, UpdateAliasResult> wrapper = new NRAsyncHandler<UpdateAliasRequest, UpdateAliasResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

	@Trace
    public Future<UpdateKeyDescriptionResult> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest request,
            AsyncHandler<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResult> asyncHandler) {
		String segmentName = "updateKeyDescription";
		NRAsyncHandler<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResult> wrapper = new NRAsyncHandler<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResult>(asyncHandler, NewRelic.getAgent().getTransaction().startSegment(segmentName));
		asyncHandler = wrapper;
		return Weaver.callOriginal();
    }

}
