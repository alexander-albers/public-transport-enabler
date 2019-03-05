package de.schildbach.pte.dto;

public class QueryJourneyDetailResult {

	public enum Status {
		OK, SERVICE_DOWN;
	}

	public final Status status;
	public final Trip trip;

	public QueryJourneyDetailResult(Status status, Trip trip) {
		this.status = status;
		this.trip = trip;
	}

	public QueryJourneyDetailResult(Status status) {
		this.status = status;
		this.trip = null;
	}
}