package com.mccorby.federatedlearning.app.presentation;

import com.mccorby.federatedlearning.core.domain.model.FederatedModel;
import com.mccorby.federatedlearning.core.domain.repository.FederatedRepository;

public interface TrainerView {

    void onTrainingDone(FederatedModel model);

    void onDataReady(FederatedRepository result);

    void onError(String errorMessage);

    void onGradientSent(Boolean aBoolean);

    void onGradientReceived(byte[] gradient);
}