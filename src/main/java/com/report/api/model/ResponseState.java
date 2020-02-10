package com.report.api.model;

import com.report.api.constant.CommonConstant;
import lombok.Data;

@Data
public class ResponseState {

    String message = CommonConstant.RESPONSE_MSG.FAILED.getValue();
    int state = CommonConstant.RESPONSE_STATUS.FAILED.getValue();

    public ResponseState(String message, int state) {
        this.message = message;
        this.state = state;
    }

    public ResponseState() {
        super();
    }
}
