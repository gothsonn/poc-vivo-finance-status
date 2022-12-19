package com.accenture.pacvivofinancestatus.repository;

import com.accenture.pacvivofinancestatus.model.CustomerBill;
import com.accenture.pacvivofinancestatus.model.FinancialAccount;

public interface CustomerBillRepository {

    CustomerBill createCustomerBill(FinancialAccount financialAccount);
    
}
