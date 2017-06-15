package com.crimps.services.lifeline;

import com.alibaba.fastjson.JSON;
import com.crimps.util.FileUtil;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by crimps on 2017/6/14.
 */
public class ReadStoryData {
    private static final String FILE_DIR = "lifeLineStoryData";
    private static final String FILE_SCENES = FILE_DIR + File.separator + "scenes_cn.json";
    private static final String FILE_CHOICES = FILE_DIR + File.separator + "choices_cn.json";
    private static final String FILE_PROCESS = FILE_DIR + File.separator + "GameProgress.json";
    private static final String FILE_PARAMETER = FILE_DIR + File.separator + "GameParameters.json";

    private static Map<String, List<String>> choicesMap;
    private static Map<String, List<String>> scenesMap;

    /**
     * 读取lifeline游戏内容
     * @return
     */
    public static boolean readStoryDate() {
        try {
            StringBuffer scenesBuff = new StringBuffer();
            StringBuffer choicesBuff = new StringBuffer();
            FileUtil.readToBuffer(scenesBuff, FILE_SCENES);
            FileUtil.readToBuffer(choicesBuff, FILE_CHOICES);
            scenesMap = (Map<String, List<String>>) JSON.parse(scenesBuff.toString());
            choicesMap = (Map<String, List<String>>) JSON.parse(choicesBuff.toString());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 读取lifeline游戏进度
     * @return
     */
    public static Map<String, String> readGameProgress() {
        Map<String, String> gameProgressMap = new HashMap<String, String>();
        try {
            gameProgressMap = FileUtil.readToMap(FILE_PROCESS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gameProgressMap;
    }

    /**
     * 写入lifeline游戏进度
     * @param content 文本内容
     * @return
     */
    public static boolean writeGameProgress(String content) {
        return FileUtil.writeToFile(content, FILE_PROCESS);
    }

    /**
     * 读取游戏参数
     * @return
     */
    public static Map<String, String> readGameParameter() {
        Map<String, String> gameParameterMap = new HashMap<String, String>();
        try {
            gameParameterMap = FileUtil.readToMap(FILE_PARAMETER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gameParameterMap;
    }

    /**
     * 写入lifeline游戏参数
     * @param content 文本内容
     * @return
     */
    public static boolean writeGameParameter(String content) {
        return FileUtil.writeToFile(content, FILE_PARAMETER);
    }
}