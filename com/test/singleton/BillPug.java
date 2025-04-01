package com.test.singleton;

import javax.management.InstanceAlreadyExistsException;

public class BillPug
{

    private BillPug() throws InstanceAlreadyExistsException
    {
        if(BillPugHelper.billPug != null)
        {
            throw new InstanceAlreadyExistsException("Instance exists");
        }
    }

    public BillPug readResolve()
    {
        return BillPugHelper.billPug;
    }

    public static BillPug getBillPugInstance()
    {
        return BillPugHelper.billPug;
    }

    private static class BillPugHelper
    {
        private static final BillPug billPug;

        static {
            try {
                billPug = new BillPug();
            } catch (InstanceAlreadyExistsException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
