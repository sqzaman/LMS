package mpp.lab.lms.service;

import java.util.List;

import mpp.lab.lms.exceptions.CheckoutException;

public interface CheckoutService {
	public void checkout(int memberId, List<String> isbn) throws CheckoutException;
}
