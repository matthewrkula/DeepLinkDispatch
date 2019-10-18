package com.example;

import com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate;
import java.util.Arrays;

public final class DeepLinkDelegate extends BaseDeepLinkDelegate {
    public DeepLinkDelegate(SampleModuleLoader sampleModuleLoader,
                            OtherSampleModuleLoader otherSampleModuleLoader) {
        super(Arrays.asList(
            sampleModuleLoader,
            otherSampleModuleLoader
        ));
    }
}
