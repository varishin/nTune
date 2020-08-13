package com.neokii.ntune

import org.json.JSONObject

class LqrTuneActivity: BaseTuneActivity() {

    override fun getRemoteConfFile(): String {
        return "/data/ntune/lat_lqr.json"
    }

    override fun getItemList(json: JSONObject): ArrayList<TuneItemInfo> {

        val list = ArrayList<TuneItemInfo>()

        list.add(TuneItemInfo("scale", json.getDouble("scale").toFloat(), 500.0f, 5000.0f, 50.0f, 1))
        list.add(TuneItemInfo("ki", json.getDouble("ki").toFloat(), 0.0f, 0.2f, 0.01f, 3))

        list.add(TuneItemInfo("k_1", json.getDouble("k_1").toFloat(), -150.0f, -50.0f, 5.0f, 1))
        list.add(TuneItemInfo("k_2", json.getDouble("k_2").toFloat(), 400.0f, 500.0f, 5.0f, 1))

        list.add(TuneItemInfo("l_1", json.getDouble("l_1").toFloat(), 0.1f, 0.5f, 0.01f, 3))
        list.add(TuneItemInfo("l_2", json.getDouble("l_2").toFloat(), 0.1f, 0.5f, 0.01f, 3))

        list.add(TuneItemInfo("dcGain", json.getDouble("dcGain").toFloat(), 0.0020f, 0.0040f, 0.0001f, 5))

        return list
    }
}