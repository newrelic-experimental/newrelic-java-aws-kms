package com.nr.instrumentation.kms;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.handlers.AsyncHandler;
import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Segment;

public class NRAsyncHandler<REQUEST extends AmazonWebServiceRequest, RESULT> implements AsyncHandler<REQUEST , RESULT> {

	private AsyncHandler<REQUEST , RESULT> delegate = null;
	
	private Segment segment = null;
	
	public NRAsyncHandler(AsyncHandler<REQUEST, RESULT> d, Segment s) {
		super();
		this.delegate = d;
		this.segment = s;
	}

	@Override
	public void onError(Exception exception) {
		NewRelic.noticeError(exception);
		if(segment != null) {
			segment.end();
			segment = null;
		}
		delegate.onError(exception);
	}

	@Override
	public void onSuccess(REQUEST request, RESULT result) {
		if(segment != null) {
			segment.end();
			segment = null;
		}
		delegate.onSuccess(request, result);
	}

}
