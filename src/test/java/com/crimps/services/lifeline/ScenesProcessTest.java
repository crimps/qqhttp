package com.crimps.services.lifeline;

import org.junit.Test;

import java.util.List;

/**
 * Created by crimps on 2017/6/16.
 */
public class ScenesProcessTest {
    @Test
    public void testProcessScenes() throws Exception {
        ReadStoryData.readStoryDate();
        List<String> scene8List = ReadStoryData.scenesMap.get("makecampatcaravel");
        ScenesProcess.processScenes(scene8List);

    }

    @Test
    public void testMatchIf() {

    }
}