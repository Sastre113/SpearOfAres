package spear.of.ares.utils;

import org.springframework.http.HttpStatus;

import spear.of.ares.model.dto.HttpResponse;

public final class AresUtilsHttp {


	public static HttpResponse construirHttpResponse(int codeHttp) {
		HttpStatus status = HttpStatus.valueOf(codeHttp);
		return new HttpResponse(String.valueOf(status.value())
				, status.getReasonPhrase());
	}
}
