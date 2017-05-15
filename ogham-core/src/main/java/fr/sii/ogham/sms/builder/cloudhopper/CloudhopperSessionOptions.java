package fr.sii.ogham.sms.builder.cloudhopper;

import fr.sii.ogham.core.retry.Retry;

public class CloudhopperSessionOptions {
	private Long bindTimeout;
	private Long connectTimeout;
	private Long requestExpiryTimeout;
	private Long windowMonitorInterval;
	private Integer windowSize;
	private Long windowWaitTimeout;
	private Long writeTimeout;
	private Long responseTimeout;
	private Long unbindTimeout;
	private Retry connectRetry;
	public Long getBindTimeout() {
		return bindTimeout;
	}
	public void setBindTimeout(Long bind) {
		this.bindTimeout = bind;
	}
	public Long getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(Long connect) {
		this.connectTimeout = connect;
	}
	public Long getRequestExpiryTimeout() {
		return requestExpiryTimeout;
	}
	public void setRequestExpiryTimeout(Long requestExpiry) {
		this.requestExpiryTimeout = requestExpiry;
	}
	public Long getWindowMonitorInterval() {
		return windowMonitorInterval;
	}
	public void setWindowMonitorInterval(Long windowMonitorInterval) {
		this.windowMonitorInterval = windowMonitorInterval;
	}
	public Integer getWindowSize() {
		return windowSize;
	}
	public void setWindowSize(Integer windowSize) {
		this.windowSize = windowSize;
	}
	public Long getWindowWaitTimeout() {
		return windowWaitTimeout;
	}
	public void setWindowWaitTimeout(Long windowWait) {
		this.windowWaitTimeout = windowWait;
	}
	public Long getWriteTimeout() {
		return writeTimeout;
	}
	public void setWriteTimeout(Long write) {
		this.writeTimeout = write;
	}
	public Long getResponseTimeout() {
		return responseTimeout;
	}
	public void setResponseTimeout(Long response) {
		this.responseTimeout = response;
	}
	public Long getUnbindTimeout() {
		return unbindTimeout;
	}
	public void setUnbindTimeout(Long unbind) {
		this.unbindTimeout = unbind;
	}
	public Retry getConnectRetry() {
		return connectRetry;
	}
	public void setConnectRetry(Retry connectRetry) {
		this.connectRetry = connectRetry;
	}
}