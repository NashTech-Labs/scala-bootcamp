package com.atm;

import com.atm.model.AccountType;
import com.atm.model.TransactionType;

import java.util.List;

public class ATMUtil {
    public static List<AccountType> getAccountTypesList () {
        List<AccountType> accountTypes = new ArrayList<> ();
        AccountType type = new AccountType();
        type.setName("Saving Account");
        accountTypes.add(type);

        AccountType type2 = new AccountType();
        type2.setName("Current Account");
        accountTypes.add(type2);

        return accountTypes;

    }

    public static List<TransactionType> getTransactionTypesList () {
        List<TransactionType> transTypes = new ArrayList<> ();
        TransactionType type = new TransactionType();
        type.setName("Withdraw Amount");
        transTypes.add(type);

        TransactionType type2 = new TransactionType();
        type2.setName("Deposit Amount");
        transTypes.add(type2);

        return transTypes;

    }
}
