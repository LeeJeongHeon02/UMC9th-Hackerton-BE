package com.umc9th.dumMoney.domain.member.exception;


import com.umc9th.dumMoney.global.apiPayload.code.BaseErrorCode;
import com.umc9th.dumMoney.global.apiPayload.exception.GeneralException;

public class MemberException extends GeneralException {
    public MemberException(BaseErrorCode code) {
        super(code);
    }
}
