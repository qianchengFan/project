package com.template.contracts;


import com.r3.corda.lib.tokens.contracts.EvolvableTokenContract;
import com.template.states.CustomTokenState;
import net.corda.core.contracts.Contract;
import net.corda.core.transactions.LedgerTransaction;
import org.jetbrains.annotations.NotNull;
import static net.corda.core.contracts.ContractsDSL.requireThat;

public class CustomTokenContract extends EvolvableTokenContract implements Contract {

    public static final String CONTRACT_ID = "com.template.contracts.CustomTokenContract";


    @Override
    public void additionalCreateChecks(@NotNull LedgerTransaction tx) {
        CustomTokenState newToken = (CustomTokenState) tx.getOutputStates().get(0);
        requireThat( require -> {
            return null;
        });
    }

    @Override
    public void additionalUpdateChecks(@NotNull LedgerTransaction tx) {
        /*This additional check does not apply to this use case.
         *This sample does not allow token update */
    }
}
