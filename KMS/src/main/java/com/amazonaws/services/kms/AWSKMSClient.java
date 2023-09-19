package com.amazonaws.services.kms;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpResponseHandler;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave(type=MatchType.BaseClass)
public abstract class AWSKMSClient {

	@Trace
	private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
		AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
		String requestType = originalRequest.getClass().getSimpleName();
		NewRelic.getAgent().getTracedMethod().setMetricName(new String[] {"Custom","AWSKMSClient","invoke",requestType});
		Response<X> resp = Weaver.callOriginal();
		
		return resp;
	}
}
