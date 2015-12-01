package com.github.dreamhead.moco.rest;

import com.github.dreamhead.moco.RequestMatcher;
import com.github.dreamhead.moco.ResponseHandler;
import com.google.common.base.Optional;

public class PutRestSetting extends RestSingleSetting {
    private final Optional<RequestMatcher> matcher;

    public PutRestSetting(final String id, final Optional<RequestMatcher> matcher, final ResponseHandler handler) {
        super(id, handler);
        this.matcher = matcher;
    }

    @Override
    protected Optional<RequestMatcher> doGetRequestMatcher() {
        return this.matcher;
    }
}