package mpp.lab.lms.service;

import java.util.List;

public interface CheckoutService {
	public void checkout(int memberId, List<String> isbn) throws Exception;
}
