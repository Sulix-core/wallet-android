package com.onix.core.coins.families;

import com.onix.core.messages.MessageFactory;
import com.onix.core.wallet.families.clams.ClamsTxMessage;

import javax.annotation.Nullable;

/**
 * @author John L. Jegutanis
 *
 * This family contains Clams
 */
public class ClamsFamily extends BitFamily {
    {
        family = Families.CLAMS;
    }

    @Override
    @Nullable
    public MessageFactory getMessagesFactory() {
        return ClamsTxMessage.getFactory();
    }
}
