package com.algaworks.algasensors.device.management.common;

import io.hypersistence.tsid.TSID;

import java.util.Optional;

public class IdGenerator {

    private static final TSID.Factory tsidFactory;

    static {
        Optional.ofNullable(System.getenv("tsid.node")).ifPresent(tsidNode -> System.setProperty("tsid.node", tsidNode));
        Optional.ofNullable(System.getenv("tsid.node.count")).ifPresent(tsidCount -> System.setProperty("tsid.node.count", tsidCount));

        tsidFactory = TSID.Factory.builder().build();
    }

    private IdGenerator() {
    }

    public static TSID generateTSID() {
        return tsidFactory.generate();
    }
}