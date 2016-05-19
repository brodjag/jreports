package com.jackreports;

/**
 * Created by brodjag on 17.05.16.
 */
/*
public class tempData {
    public String jsonAnsver="{\n" +
            "    \"status\": true,\n" +
            "    \"result\": {\n" +
            "        \"ws\": {\n" +
            "            \"1\": {\n" +
            "                \"status\": 0,\n" +
            "                \"loading\": 0\n" +
            "            },\n" +
            "            \"2\": {\n" +
            "                \"status\": null,\n" +
            "                \"loading\": null\n" +
            "            }\n" +
            "        },\n" +
            "        \"cbp\": [],\n" +
            "        \"ms\": {\n" +
            "            \"555\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.654324943618995\",\n" +
            "                \"longitude\": \"-119.9854364991188\",\n" +
            "                \"state\": \"Nevada\",\n" +
            "                \"name\": \"Bordertown\",\n" +
            "                \"road_f\": \"Highway 395\",\n" +
            "                \"road_s\": \"US-395\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"556\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.655103465189455\",\n" +
            "                \"longitude\": \"-119.98437568545341\",\n" +
            "                \"state\": \"Nevada\",\n" +
            "                \"name\": \"Bordertown\",\n" +
            "                \"road_f\": \"Highway 395\",\n" +
            "                \"road_s\": \"US-395\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"557\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.240031276710496\",\n" +
            "                \"longitude\": \"-114.88758713006973\",\n" +
            "                \"state\": \"Nevada\",\n" +
            "                \"name\": \"Ely\",\n" +
            "                \"road_f\": \"Highway 6\",\n" +
            "                \"road_s\": \"US-6\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"558\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.51352061288554\",\n" +
            "                \"longitude\": \"-119.9786813557148\",\n" +
            "                \"state\": \"Nevada\",\n" +
            "                \"name\": \"Garson\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"559\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.52526264678086\",\n" +
            "                \"longitude\": \"-119.62177723646164\",\n" +
            "                \"state\": \"Nevada\",\n" +
            "                \"name\": \"Mustang\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"561\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.9423486664638\",\n" +
            "                \"longitude\": \"-115.64515359699726\",\n" +
            "                \"state\": \"Nevada\",\n" +
            "                \"name\": \"Osino\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"563\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.602361020800295\",\n" +
            "                \"longitude\": \"-119.3347916007042\",\n" +
            "                \"state\": \"Nevada\",\n" +
            "                \"name\": \"Wadsworth\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1195\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"38.95729\",\n" +
            "                \"longitude\": \"-122.62269\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Clearlake\",\n" +
            "                \"road_f\": \"California 53\",\n" +
            "                \"road_s\": \"CA-53\",\n" +
            "                \"direction\": \"NB/SB\"\n" +
            "            },\n" +
            "            \"1196\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.02588832906631\",\n" +
            "                \"longitude\": \"-122.66085281968117\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Clearlake Oaks\",\n" +
            "                \"road_f\": \"California 20\",\n" +
            "                \"road_s\": \"CA-20\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1199\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.38635286447075\",\n" +
            "                \"longitude\": \"-120.79474344849586\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Lassen\",\n" +
            "                \"road_f\": \"California 36\",\n" +
            "                \"road_s\": \"CA-36\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1200\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.077961757521756\",\n" +
            "                \"longitude\": \"-123.46511453390121\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Mendocino\",\n" +
            "                \"road_f\": \"California 128\",\n" +
            "                \"road_s\": \"CA-128\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1201\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.62554447058537\",\n" +
            "                \"longitude\": \"-123.46315383911133\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Mendocino\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1206\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.5836488723311\",\n" +
            "                \"longitude\": \"-122.42791771888733\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Buenaventura\",\n" +
            "                \"road_f\": \"California 299\",\n" +
            "                \"road_s\": \"CA-299\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1207\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.186238135198835\",\n" +
            "                \"longitude\": \"-120.94434231519699\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Camby\",\n" +
            "                \"road_f\": \"California 139\",\n" +
            "                \"road_s\": \"CA-139\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1208\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.14721585673944\",\n" +
            "                \"longitude\": \"-121.64773285388947\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Dana\",\n" +
            "                \"road_f\": \"California 89\",\n" +
            "                \"road_s\": \"CA-89\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1209\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.618480572392585\",\n" +
            "                \"longitude\": \"-122.99786031246185\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Douglas City\",\n" +
            "                \"road_f\": \"California 3\",\n" +
            "                \"road_s\": \"CA-3\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1211\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.38940200118717\",\n" +
            "                \"longitude\": \"-123.24962049722672\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Forest Glen\",\n" +
            "                \"road_f\": \"California 36\",\n" +
            "                \"road_s\": \"CA-36\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1213\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.573085129207\",\n" +
            "                \"longitude\": \"-121.18257880210876\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Hackamore\",\n" +
            "                \"road_f\": \"California 139\",\n" +
            "                \"road_s\": \"CA-139\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1214\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.79626203178967\",\n" +
            "                \"longitude\": \"-123.37540805339813\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Happy Camp\",\n" +
            "                \"road_f\": \"California 96\",\n" +
            "                \"road_s\": \"CA-96\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1215\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.562407048696095\",\n" +
            "                \"longitude\": \"-121.57569140195847\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Hat Creek\",\n" +
            "                \"road_f\": \"California 44\",\n" +
            "                \"road_s\": \"CA-44\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1221\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.42194203965587\",\n" +
            "                \"longitude\": \"-120.69659471511841\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Lassen\",\n" +
            "                \"road_f\": \"California 36\",\n" +
            "                \"road_s\": \"CA-36\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1222\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.544032247429776\",\n" +
            "                \"longitude\": \"-122.22838684916496\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Living Memorial\",\n" +
            "                \"road_f\": \"Highway 97\",\n" +
            "                \"road_s\": \"US-97\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1223\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.51382566396474\",\n" +
            "                \"longitude\": \"-122.02449604868889\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Millville\",\n" +
            "                \"road_f\": \"California 44\",\n" +
            "                \"road_s\": \"CA-44\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1224\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.803003534277956\",\n" +
            "                \"longitude\": \"-120.17345935106277\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Plumas\",\n" +
            "                \"road_f\": \"California 70\",\n" +
            "                \"road_s\": \"CA-70\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1226\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.49951745346695\",\n" +
            "                \"longitude\": \"-122.37365260720253\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Redding\",\n" +
            "                \"road_f\": \"California 273\",\n" +
            "                \"road_s\": \"CA-273\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1228\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.8610781018398\",\n" +
            "                \"longitude\": \"-120.45419678092003\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Termo\",\n" +
            "                \"road_f\": \"Highway 395\",\n" +
            "                \"road_s\": \"US-395\",\n" +
            "                \"direction\": \"NB/SB\"\n" +
            "            },\n" +
            "            \"1231\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.448253367940644\",\n" +
            "                \"longitude\": \"-122.36390009522438\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Weed\",\n" +
            "                \"road_f\": \"Highway 97\",\n" +
            "                \"road_s\": \"US-97\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1232\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.89232965882111\",\n" +
            "                \"longitude\": \"-121.65088444948196\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Burney\",\n" +
            "                \"road_f\": \"California 299\",\n" +
            "                \"road_s\": \"CA-299\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1234\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"40.16980046196818\",\n" +
            "                \"longitude\": \"-120.96742272377014\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Greenville\",\n" +
            "                \"road_f\": \"California 89\",\n" +
            "                \"road_s\": \"CA-89\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1237\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.17529259719216\",\n" +
            "                \"longitude\": \"-121.69988170266151\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Ponderosa\",\n" +
            "                \"road_f\": \"California 89\",\n" +
            "                \"road_s\": \"CA-89\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1238\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"41.49746080783554\",\n" +
            "                \"longitude\": \"-120.60401424765587\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Rattlesnake\",\n" +
            "                \"road_f\": \"California 299\",\n" +
            "                \"road_s\": \"CA-299\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1239\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.457056668725336\",\n" +
            "                \"longitude\": \"-121.05209603905678\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Camptonville\",\n" +
            "                \"road_f\": \"California 49\",\n" +
            "                \"road_s\": \"CA-49\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1242\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.26605\",\n" +
            "                \"longitude\": \"-121.04141\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Nevada City\",\n" +
            "                \"road_f\": \"California 49\",\n" +
            "                \"road_s\": \"CA-49\",\n" +
            "                \"direction\": \"EB/WB\"\n" +
            "            },\n" +
            "            \"1243\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"38.771393077894984\",\n" +
            "                \"longitude\": \"-120.45491024851799\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Riverton\",\n" +
            "                \"road_f\": \"Highway 50\",\n" +
            "                \"road_s\": \"US-50\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1244\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"39.59175231407857\",\n" +
            "                \"longitude\": \"-120.37634029984474\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Sierra\",\n" +
            "                \"road_f\": \"California 49\",\n" +
            "                \"road_s\": \"CA-49\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1245\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"38.75789946863287\",\n" +
            "                \"longitude\": \"-121.54361218214035\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Sutter\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1249\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"35.08181001859196\",\n" +
            "                \"longitude\": \"-120.52767723798752\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"San Luis Obispo\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1252\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"34.39468462380781\",\n" +
            "                \"longitude\": \"-118.92825320363045\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Fillmore\",\n" +
            "                \"road_f\": \"California 126\",\n" +
            "                \"road_s\": \"CA-126\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1258\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"34.06674903963023\",\n" +
            "                \"longitude\": \"-117.46356725692749\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"San Bernardino\",\n" +
            "                \"road_f\": \"Interstate 10\",\n" +
            "                \"road_s\": \"I-10\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1263\": {\n" +
            "                \"title\": \"Inspection Site\",\n" +
            "                \"status\": 0,\n" +
            "                \"caption\": \"NO DATA\",\n" +
            "                \"latitude\": \"38.77597367417516\",\n" +
            "                \"longitude\": \"-119.91659760475159\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"name\": \"Picketts Junction\",\n" +
            "                \"road_f\": \"California 88\",\n" +
            "                \"road_s\": \"CA-88\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"msra\": [],\n" +
            "        \"wim\": {\n" +
            "            \"1271\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"40.636465\",\n" +
            "                \"longitude\": \"-124.211961\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1272\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"40.636498\",\n" +
            "                \"longitude\": \"-124.212082\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1273\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.112667662056474\",\n" +
            "                \"longitude\": \"-123.19578319787979\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1274\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.112820105734805\",\n" +
            "                \"longitude\": \"-123.19555655121803\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1275\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.07494775327204\",\n" +
            "                \"longitude\": \"-122.93098345398903\",\n" +
            "                \"road_f\": \"California 29\",\n" +
            "                \"road_s\": \"CA-29\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1276\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.074873833070264\",\n" +
            "                \"longitude\": \"-122.9307809472084\",\n" +
            "                \"road_f\": \"California 29\",\n" +
            "                \"road_s\": \"CA-29\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1277\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"40.71624754094788\",\n" +
            "                \"longitude\": \"-122.3307553678751\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1278\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"40.71618604331434\",\n" +
            "                \"longitude\": \"-122.33055353164673\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1279\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"41.75827513580215\",\n" +
            "                \"longitude\": \"-122.06465609371662\",\n" +
            "                \"road_f\": \"Highway 97\",\n" +
            "                \"road_s\": \"US-97\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1280\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"41.758279637655654\",\n" +
            "                \"longitude\": \"-122.06467486917973\",\n" +
            "                \"road_f\": \"Highway 97\",\n" +
            "                \"road_s\": \"US-97\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1281\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"41.321627\",\n" +
            "                \"longitude\": \"-122.326639\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1282\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"41.321613\",\n" +
            "                \"longitude\": \"-122.326285\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1283\": null,\n" +
            "            \"1284\": null,\n" +
            "            \"1285\": null,\n" +
            "            \"1286\": null,\n" +
            "            \"1287\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.33657814839406\",\n" +
            "                \"longitude\": \"-121.33235804736614\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1288\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.33650451281737\",\n" +
            "                \"longitude\": \"-121.33257731795311\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1289\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.97866414666424\",\n" +
            "                \"longitude\": \"-121.10839024186134\",\n" +
            "                \"road_f\": \"California 49\",\n" +
            "                \"road_s\": \"CA-49\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1290\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.9785536364727\",\n" +
            "                \"longitude\": \"-121.10848680138588\",\n" +
            "                \"road_f\": \"California 49\",\n" +
            "                \"road_s\": \"CA-49\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1291\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.55745350189659\",\n" +
            "                \"longitude\": \"-121.44779831171036\",\n" +
            "                \"road_f\": \"Highway 50\",\n" +
            "                \"road_s\": \"US-50\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1292\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.55768880787441\",\n" +
            "                \"longitude\": \"-121.44773527979851\",\n" +
            "                \"road_f\": \"Highway 50\",\n" +
            "                \"road_s\": \"US-50\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1293\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.969271207357416\",\n" +
            "                \"longitude\": \"-121.0180614888668\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1294\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.96938903082787\",\n" +
            "                \"longitude\": \"-121.01826399564743\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1295\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.67108392516974\",\n" +
            "                \"longitude\": \"-121.59808918833733\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1296\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.67138748216687\",\n" +
            "                \"longitude\": \"-121.5982474386692\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1297\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.70214519733606\",\n" +
            "                \"longitude\": \"-121.54016688466072\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1298\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.702120035184585\",\n" +
            "                \"longitude\": \"-121.54042169451714\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1299\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.75203924666888\",\n" +
            "                \"longitude\": \"-121.84148222208023\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1300\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.75207233433876\",\n" +
            "                \"longitude\": \"-121.84111341834068\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1301\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.778618631132986\",\n" +
            "                \"longitude\": \"-121.87865227460861\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1302\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.77874835614379\",\n" +
            "                \"longitude\": \"-121.87844708561897\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1303\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.53817555699384\",\n" +
            "                \"longitude\": \"-122.21490874886513\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1304\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"39.53824278390035\",\n" +
            "                \"longitude\": \"-122.21460029482841\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1305\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.99513197022137\",\n" +
            "                \"longitude\": \"-122.06786468625069\",\n" +
            "                \"road_f\": \"California 4\",\n" +
            "                \"road_s\": \"CA-4\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1306\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.995106\",\n" +
            "                \"longitude\": \"-122.068597\",\n" +
            "                \"road_f\": \"California 4\",\n" +
            "                \"road_s\": \"CA-4\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1307\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.214001412742576\",\n" +
            "                \"longitude\": \"-122.2163075208664\",\n" +
            "                \"road_f\": \"California 12\",\n" +
            "                \"road_s\": \"CA-12\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1308\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.214093085761185\",\n" +
            "                \"longitude\": \"-122.21624717116356\",\n" +
            "                \"road_f\": \"California 12\",\n" +
            "                \"road_s\": \"CA-12\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1309\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.25649800851203\",\n" +
            "                \"longitude\": \"-122.30302467942238\",\n" +
            "                \"road_f\": \"California 29\",\n" +
            "                \"road_s\": \"CA-29\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1310\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.25897617034077\",\n" +
            "                \"longitude\": \"-122.30196788907051\",\n" +
            "                \"road_f\": \"California 29/121\",\n" +
            "                \"road_s\": \"CA-29/121\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1311\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.15047693955182\",\n" +
            "                \"longitude\": \"-122.45007142424583\",\n" +
            "                \"road_f\": \"California 37\",\n" +
            "                \"road_s\": \"CA-37\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1312\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.12146772058183\",\n" +
            "                \"longitude\": \"-122.49698996543884\",\n" +
            "                \"road_f\": \"California 37\",\n" +
            "                \"road_s\": \"CA-37\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1313\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.121656574641584\",\n" +
            "                \"longitude\": \"-122.49711602926254\",\n" +
            "                \"road_f\": \"California 37\",\n" +
            "                \"road_s\": \"CA-37\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1314\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.99155519311198\",\n" +
            "                \"longitude\": \"-122.3086465895176\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1315\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.99207236431542\",\n" +
            "                \"longitude\": \"-122.30790629982948\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1316\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.39563092815845\",\n" +
            "                \"longitude\": \"-121.92406609654427\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1317\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.39588213764586\",\n" +
            "                \"longitude\": \"-121.92417338490486\",\n" +
            "                \"road_f\": \"Interstate 80\",\n" +
            "                \"road_s\": \"I-80\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1318\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.556965301420036\",\n" +
            "                \"longitude\": \"-122.28434577584267\",\n" +
            "                \"road_f\": \"California 92\",\n" +
            "                \"road_s\": \"CA-92\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1319\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.56883774582716\",\n" +
            "                \"longitude\": \"-122.26752698421478\",\n" +
            "                \"road_f\": \"California 92\",\n" +
            "                \"road_s\": \"CA-92\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1320\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.55760129264522\",\n" +
            "                \"longitude\": \"-122.28280484676361\",\n" +
            "                \"road_f\": \"California 92\",\n" +
            "                \"road_s\": \"CA-92\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1321\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.56890840052632\",\n" +
            "                \"longitude\": \"-122.26771742105484\",\n" +
            "                \"road_f\": \"California 92\",\n" +
            "                \"road_s\": \"CA-92\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1322\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.07649720456232\",\n" +
            "                \"longitude\": \"-122.54250034689903\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1323\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.13977217405254\",\n" +
            "                \"longitude\": \"-121.6394367814064\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1324\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.13963459014531\",\n" +
            "                \"longitude\": \"-121.63981631398201\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1325\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.601725520791426\",\n" +
            "                \"longitude\": \"-122.37931609153748\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1326\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.59104106740511\",\n" +
            "                \"longitude\": \"-122.36256837844849\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1327\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.017570070151024\",\n" +
            "                \"longitude\": \"-121.33566319942474\",\n" +
            "                \"road_f\": \"California 152\",\n" +
            "                \"road_s\": \"CA-152\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1328\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.01770713321219\",\n" +
            "                \"longitude\": \"-121.33584290742874\",\n" +
            "                \"road_f\": \"California 152\",\n" +
            "                \"road_s\": \"CA-152\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1329\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.44956443779495\",\n" +
            "                \"longitude\": \"-122.27780655026436\",\n" +
            "                \"road_f\": \"Interstate 280\",\n" +
            "                \"road_s\": \"I-280\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1330\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.44980986587196\",\n" +
            "                \"longitude\": \"-122.27772071957588\",\n" +
            "                \"road_f\": \"Interstate 280\",\n" +
            "                \"road_s\": \"I-280\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1331\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.40480916964148\",\n" +
            "                \"longitude\": \"-121.9471076130867\",\n" +
            "                \"road_f\": \"Interstate 505\",\n" +
            "                \"road_s\": \"I-505\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1332\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.4049191528375\",\n" +
            "                \"longitude\": \"-121.94738522171974\",\n" +
            "                \"road_f\": \"Interstate 505\",\n" +
            "                \"road_s\": \"I-505\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1333\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.724040758455004\",\n" +
            "                \"longitude\": \"-121.94075882434845\",\n" +
            "                \"road_f\": \"Interstate 680\",\n" +
            "                \"road_s\": \"I-680\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1334\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.7242041167375\",\n" +
            "                \"longitude\": \"-121.94057911634445\",\n" +
            "                \"road_f\": \"Interstate 680\",\n" +
            "                \"road_s\": \"I-680\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1335\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.61868825846852\",\n" +
            "                \"longitude\": \"-122.07533195614815\",\n" +
            "                \"road_f\": \"Interstate 880\",\n" +
            "                \"road_s\": \"I-880\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1336\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.618351745756506\",\n" +
            "                \"longitude\": \"-122.07479685544968\",\n" +
            "                \"road_f\": \"Interstate 880\",\n" +
            "                \"road_s\": \"I-880\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1337\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.66141074302818\",\n" +
            "                \"longitude\": \"-120.42771935462952\",\n" +
            "                \"road_f\": \"California 46\",\n" +
            "                \"road_s\": \"CA-46\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1338\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.66162648664788\",\n" +
            "                \"longitude\": \"-120.4277354478836\",\n" +
            "                \"road_f\": \"California 46\",\n" +
            "                \"road_s\": \"CA-46\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1339\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.528479667014146\",\n" +
            "                \"longitude\": \"-120.70626005530357\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1340\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.52886245670855\",\n" +
            "                \"longitude\": \"-120.70637002587318\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1341\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.426936524649506\",\n" +
            "                \"longitude\": \"-119.72718134522438\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1342\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.42677382553038\",\n" +
            "                \"longitude\": \"-119.72721621394157\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1343\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.265746597843574\",\n" +
            "                \"longitude\": \"-121.18012726306915\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1344\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.26545356268747\",\n" +
            "                \"longitude\": \"-121.18030026555061\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1345\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.995029889304945\",\n" +
            "                \"longitude\": \"-120.42035400867462\",\n" +
            "                \"road_f\": \"California 166\",\n" +
            "                \"road_s\": \"CA-166\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1346\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.99498704252014\",\n" +
            "                \"longitude\": \"-120.42033925652504\",\n" +
            "                \"road_f\": \"California 166\",\n" +
            "                \"road_s\": \"CA-166\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1347\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.1163572179391\",\n" +
            "                \"longitude\": \"-118.25917348265648\",\n" +
            "                \"road_f\": \"Highway 395\",\n" +
            "                \"road_s\": \"US-395\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1348\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.116003241604176\",\n" +
            "                \"longitude\": \"-118.25940012931824\",\n" +
            "                \"road_f\": \"Highway 395\",\n" +
            "                \"road_s\": \"US-395\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1349\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.77877598387683\",\n" +
            "                \"longitude\": \"-119.84513148665428\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1350\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.77828509028802\",\n" +
            "                \"longitude\": \"-119.84483510255814\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1351\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.81271413245776\",\n" +
            "                \"longitude\": \"-119.89312827587128\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1352\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.81283331152847\",\n" +
            "                \"longitude\": \"-119.89292442798615\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1353\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.81488831605128\",\n" +
            "                \"longitude\": \"-119.89586144685745\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1354\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.81501393366079\",\n" +
            "                \"longitude\": \"-119.89566028118134\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1355\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.82862021367123\",\n" +
            "                \"longitude\": \"-119.91311073303223\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1356\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.82877371873028\",\n" +
            "                \"longitude\": \"-119.91292968392372\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1357\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.803465915041805\",\n" +
            "                \"longitude\": \"-119.88022282719612\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1358\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.365418767615125\",\n" +
            "                \"longitude\": \"-119.35104846954346\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1359\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.36549204147868\",\n" +
            "                \"longitude\": \"-119.35060054063797\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1360\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.305383442918405\",\n" +
            "                \"longitude\": \"-119.03311148285866\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1361\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.30544845008277\",\n" +
            "                \"longitude\": \"-119.03283387422562\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1362\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.332561318499465\",\n" +
            "                \"longitude\": \"-118.81988257169724\",\n" +
            "                \"road_f\": \"California 58\",\n" +
            "                \"road_s\": \"CA-58\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1363\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.3330208329807\",\n" +
            "                \"longitude\": \"-118.82061615586281\",\n" +
            "                \"road_f\": \"California 58\",\n" +
            "                \"road_s\": \"CA-58\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1364\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.1192724073159\",\n" +
            "                \"longitude\": \"-119.05268222093582\",\n" +
            "                \"road_f\": \"California 65\",\n" +
            "                \"road_s\": \"CA-65\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1365\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.11923104157008\",\n" +
            "                \"longitude\": \"-119.05293300747871\",\n" +
            "                \"road_f\": \"California 65\",\n" +
            "                \"road_s\": \"CA-65\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1366\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.24766935320674\",\n" +
            "                \"longitude\": \"-119.81442555785179\",\n" +
            "                \"road_f\": \"California 41\",\n" +
            "                \"road_s\": \"CA-41\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1367\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.247675842558984\",\n" +
            "                \"longitude\": \"-119.81445908546448\",\n" +
            "                \"road_f\": \"California 41\",\n" +
            "                \"road_s\": \"CA-41\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1368\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.0676415647679\",\n" +
            "                \"longitude\": \"-119.31486144661903\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1369\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.067604707230544\",\n" +
            "                \"longitude\": \"-119.3150706589222\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1370\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.450131986941386\",\n" +
            "                \"longitude\": \"-118.61386612057686\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1371\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.450404118820884\",\n" +
            "                \"longitude\": \"-118.6137306690216\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1372\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.55668782331802\",\n" +
            "                \"longitude\": \"-118.13244581222534\",\n" +
            "                \"road_f\": \"California 14\",\n" +
            "                \"road_s\": \"CA-14\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1373\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.55673310728316\",\n" +
            "                \"longitude\": \"-118.13218966126442\",\n" +
            "                \"road_f\": \"California 14\",\n" +
            "                \"road_s\": \"CA-14\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1374\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.77182784279296\",\n" +
            "                \"longitude\": \"-118.24050664901733\",\n" +
            "                \"road_f\": \"California 47\",\n" +
            "                \"road_s\": \"CA-47\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1375\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.77174478987603\",\n" +
            "                \"longitude\": \"-118.2403665035963\",\n" +
            "                \"road_f\": \"California 47\",\n" +
            "                \"road_s\": \"CA-47\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1376\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.776725035538206\",\n" +
            "                \"longitude\": \"-118.24104845523834\",\n" +
            "                \"road_f\": \"California 47\",\n" +
            "                \"road_s\": \"CA-47\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1377\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.776171007971776\",\n" +
            "                \"longitude\": \"-118.24048653244972\",\n" +
            "                \"road_f\": \"California 47\",\n" +
            "                \"road_s\": \"CA-47\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1378\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.8733169783857\",\n" +
            "                \"longitude\": \"-118.26409667730331\",\n" +
            "                \"road_f\": \"California 91\",\n" +
            "                \"road_s\": \"CA-91\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1379\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.87351853981895\",\n" +
            "                \"longitude\": \"-118.26401084661484\",\n" +
            "                \"road_f\": \"California 91\",\n" +
            "                \"road_s\": \"CA-91\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1380\": null,\n" +
            "            \"1381\": null,\n" +
            "            \"1382\": null,\n" +
            "            \"1383\": null,\n" +
            "            \"1384\": null,\n" +
            "            \"1385\": null,\n" +
            "            \"1386\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.40657660777048\",\n" +
            "                \"longitude\": \"-118.75480279326439\",\n" +
            "                \"road_f\": \"California 126\",\n" +
            "                \"road_s\": \"CA-126\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1387\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.40668172296772\",\n" +
            "                \"longitude\": \"-118.75478535890579\",\n" +
            "                \"road_f\": \"California 126\",\n" +
            "                \"road_s\": \"CA-126\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1388\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.1174073079129\",\n" +
            "                \"longitude\": \"-117.85581350326538\",\n" +
            "                \"road_f\": \"Interstate 210\",\n" +
            "                \"road_s\": \"I-210\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1389\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.11731152670275\",\n" +
            "                \"longitude\": \"-117.85811483860016\",\n" +
            "                \"road_f\": \"Interstate 210\",\n" +
            "                \"road_s\": \"I-210\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1390\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.209021746622625\",\n" +
            "                \"longitude\": \"-118.47343504428864\",\n" +
            "                \"road_f\": \"Interstate 405\",\n" +
            "                \"road_s\": \"I-405\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1391\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.20903116023499\",\n" +
            "                \"longitude\": \"-118.47319565713406\",\n" +
            "                \"road_f\": \"Interstate 405\",\n" +
            "                \"road_s\": \"I-405\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1392\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.85612581629954\",\n" +
            "                \"longitude\": \"-118.20363968610764\",\n" +
            "                \"road_f\": \"Interstate 710\",\n" +
            "                \"road_s\": \"I-710\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1393\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.8560454903612\",\n" +
            "                \"longitude\": \"-118.20340901613235\",\n" +
            "                \"road_f\": \"Interstate 710\",\n" +
            "                \"road_s\": \"I-710\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1396\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.79940566754956\",\n" +
            "                \"longitude\": \"-116.5146754682064\",\n" +
            "                \"road_f\": \"Interstate 40\",\n" +
            "                \"road_s\": \"I-40\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1397\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.79906317658135\",\n" +
            "                \"longitude\": \"-116.5147639811039\",\n" +
            "                \"road_f\": \"Interstate 40\",\n" +
            "                \"road_s\": \"I-40\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1398\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.684669453711905\",\n" +
            "                \"longitude\": \"-117.33099907636642\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1399\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.68502138546071\",\n" +
            "                \"longitude\": \"-117.33089312911034\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1400\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.0865287376631\",\n" +
            "                \"longitude\": \"-117.20049887895584\",\n" +
            "                \"road_f\": \"Interstate 10\",\n" +
            "                \"road_s\": \"I-10\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1401\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.086461195129566\",\n" +
            "                \"longitude\": \"-117.20078319311142\",\n" +
            "                \"road_f\": \"Interstate 10\",\n" +
            "                \"road_s\": \"I-10\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1408\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.90146285286518\",\n" +
            "                \"longitude\": \"-116.89405515789986\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1409\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.901671831658746\",\n" +
            "                \"longitude\": \"-116.89430728554726\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1410\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.19700005940272\",\n" +
            "                \"longitude\": \"-117.36913338303566\",\n" +
            "                \"road_f\": \"Interstate 215\",\n" +
            "                \"road_s\": \"I-215\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1411\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.196703573901\",\n" +
            "                \"longitude\": \"-117.36909717321396\",\n" +
            "                \"road_f\": \"Interstate 215\",\n" +
            "                \"road_s\": \"I-215\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1412\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.11475051674303\",\n" +
            "                \"longitude\": \"-117.5222647190094\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1413\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.11451341134699\",\n" +
            "                \"longitude\": \"-117.52195492386818\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1414\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.13226824445654\",\n" +
            "                \"longitude\": \"-117.50114232301712\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1415\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.132016253236756\",\n" +
            "                \"longitude\": \"-117.50086203217506\",\n" +
            "                \"road_f\": \"Interstate 15\",\n" +
            "                \"road_s\": \"I-15\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1416\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.9236248405489\",\n" +
            "                \"longitude\": \"-117.30569377541542\",\n" +
            "                \"road_f\": \"California 58\",\n" +
            "                \"road_s\": \"CA-58\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1417\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.92385685432263\",\n" +
            "                \"longitude\": \"-117.30560392141342\",\n" +
            "                \"road_f\": \"California 58\",\n" +
            "                \"road_s\": \"CA-58\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1418\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.065470136000386\",\n" +
            "                \"longitude\": \"-117.50097870826721\",\n" +
            "                \"road_f\": \"Interstate 10\",\n" +
            "                \"road_s\": \"I-10\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1419\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.065685382802585\",\n" +
            "                \"longitude\": \"-117.50154063105583\",\n" +
            "                \"road_f\": \"Interstate 10\",\n" +
            "                \"road_s\": \"I-10\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1420\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.03046562080959\",\n" +
            "                \"longitude\": \"-117.59097754955292\",\n" +
            "                \"road_f\": \"California 60\",\n" +
            "                \"road_s\": \"CA-60\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1421\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.03073911274925\",\n" +
            "                \"longitude\": \"-117.59192436933517\",\n" +
            "                \"road_f\": \"California 60\",\n" +
            "                \"road_s\": \"CA-60\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1422\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.009308191019365\",\n" +
            "                \"longitude\": \"-117.65072643756866\",\n" +
            "                \"road_f\": \"California 83\",\n" +
            "                \"road_s\": \"CA-83\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1423\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.00959590077578\",\n" +
            "                \"longitude\": \"-117.65093430876732\",\n" +
            "                \"road_f\": \"California 83\",\n" +
            "                \"road_s\": \"CA-83\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1424\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.95697283389601\",\n" +
            "                \"longitude\": \"-117.68090665340424\",\n" +
            "                \"road_f\": \"California 71\",\n" +
            "                \"road_s\": \"CA-71\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1425\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.95683911557749\",\n" +
            "                \"longitude\": \"-117.68105819821358\",\n" +
            "                \"road_f\": \"California 71\",\n" +
            "                \"road_s\": \"CA-71\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1426\": null,\n" +
            "            \"1427\": null,\n" +
            "            \"1428\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.52848121052466\",\n" +
            "                \"longitude\": \"-120.70626005530357\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1429\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"35.528865543714794\",\n" +
            "                \"longitude\": \"-120.70637002587318\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1430\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.42693808906255\",\n" +
            "                \"longitude\": \"-119.72718268632889\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1431\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.42677695436258\",\n" +
            "                \"longitude\": \"-119.72721084952354\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1432\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.2657476791521\",\n" +
            "                \"longitude\": \"-121.18012726306915\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1433\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"36.26545248137488\",\n" +
            "                \"longitude\": \"-121.18030026555061\",\n" +
            "                \"road_f\": \"Highway 101\",\n" +
            "                \"road_s\": \"US-101\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1434\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.99503208657537\",\n" +
            "                \"longitude\": \"-120.4203513264656\",\n" +
            "                \"road_f\": \"California 166\",\n" +
            "                \"road_s\": \"CA-166\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1435\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"34.99498264797681\",\n" +
            "                \"longitude\": \"-120.42033925652504\",\n" +
            "                \"road_f\": \"California 166\",\n" +
            "                \"road_s\": \"CA-166\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1436\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.11635935676387\",\n" +
            "                \"longitude\": \"-118.25917080044746\",\n" +
            "                \"road_f\": \"Highway 395\",\n" +
            "                \"road_s\": \"US-395\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1437\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.116003241604176\",\n" +
            "                \"longitude\": \"-118.25940147042274\",\n" +
            "                \"road_f\": \"Highway 395\",\n" +
            "                \"road_s\": \"US-395\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1438\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.17459978052904\",\n" +
            "                \"longitude\": \"-121.40008851885796\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1439\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"38.174912902140065\",\n" +
            "                \"longitude\": \"-121.39970228075981\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1440\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.08589878494517\",\n" +
            "                \"longitude\": \"-120.99832847714424\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1441\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.086110602650734\",\n" +
            "                \"longitude\": \"-120.99803745746613\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1442\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.69617653712998\",\n" +
            "                \"longitude\": \"-121.34354889392853\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1443\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.69659251388665\",\n" +
            "                \"longitude\": \"-121.34316936135292\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1444\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.056355471314205\",\n" +
            "                \"longitude\": \"-120.80360680818558\",\n" +
            "                \"road_f\": \"California 152\",\n" +
            "                \"road_s\": \"CA-152\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1445\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.05584923697039\",\n" +
            "                \"longitude\": \"-120.80362290143967\",\n" +
            "                \"road_f\": \"California 152\",\n" +
            "                \"road_s\": \"CA-152\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1446\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.76502071981751\",\n" +
            "                \"longitude\": \"-121.38891577720642\",\n" +
            "                \"road_f\": \"Interstate 205\",\n" +
            "                \"road_s\": \"I-205\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1447\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.76474825252407\",\n" +
            "                \"longitude\": \"-121.38851746916771\",\n" +
            "                \"road_f\": \"Interstate 205\",\n" +
            "                \"road_s\": \"I-205\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1448\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.64177329898628\",\n" +
            "                \"longitude\": \"-121.00985795259476\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1449\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.641579564092474\",\n" +
            "                \"longitude\": \"-121.00998803973198\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1450\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.60567131771951\",\n" +
            "                \"longitude\": \"-120.97281396389008\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1451\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.60556463670167\",\n" +
            "                \"longitude\": \"-120.97305804491043\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1452\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.553149240077545\",\n" +
            "                \"longitude\": \"-120.91272309422493\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1453\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.553001886272796\",\n" +
            "                \"longitude\": \"-120.91300338506699\",\n" +
            "                \"road_f\": \"California 99\",\n" +
            "                \"road_s\": \"CA-99\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1454\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.84336902880738\",\n" +
            "                \"longitude\": \"-120.53948298096657\",\n" +
            "                \"road_f\": \"California 120\",\n" +
            "                \"road_s\": \"CA-120\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1455\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.843025893227605\",\n" +
            "                \"longitude\": \"-120.53968012332916\",\n" +
            "                \"road_f\": \"California 120\",\n" +
            "                \"road_s\": \"CA-120\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1456\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.67286856066214\",\n" +
            "                \"longitude\": \"-121.45796790719032\",\n" +
            "                \"road_f\": \"Interstate 580\",\n" +
            "                \"road_s\": \"I-580\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1457\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"37.67268385913957\",\n" +
            "                \"longitude\": \"-121.45829111337662\",\n" +
            "                \"road_f\": \"Interstate 580\",\n" +
            "                \"road_s\": \"I-580\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1478\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.700086816189874\",\n" +
            "                \"longitude\": \"-117.7752211689949\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1479\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.700399237723296\",\n" +
            "                \"longitude\": \"-117.77502402663231\",\n" +
            "                \"road_f\": \"Interstate 5\",\n" +
            "                \"road_s\": \"I-5\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1480\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.857086571666855\",\n" +
            "                \"longitude\": \"-117.78363391757011\",\n" +
            "                \"road_f\": \"California 91\",\n" +
            "                \"road_s\": \"CA-91\",\n" +
            "                \"direction\": \"EB\"\n" +
            "            },\n" +
            "            \"1481\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.85698211091887\",\n" +
            "                \"longitude\": \"-117.78466925024986\",\n" +
            "                \"road_f\": \"California 91\",\n" +
            "                \"road_s\": \"CA-91\",\n" +
            "                \"direction\": \"WB\"\n" +
            "            },\n" +
            "            \"1482\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.92624828262447\",\n" +
            "                \"longitude\": \"-117.88028061389923\",\n" +
            "                \"road_f\": \"California 57\",\n" +
            "                \"road_s\": \"CA-57\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1483\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.9268274108366\",\n" +
            "                \"longitude\": \"-117.88004726171494\",\n" +
            "                \"road_f\": \"California 57\",\n" +
            "                \"road_s\": \"CA-57\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            },\n" +
            "            \"1484\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.75426075399475\",\n" +
            "                \"longitude\": \"-118.01645770668983\",\n" +
            "                \"road_f\": \"Interstate 405\",\n" +
            "                \"road_s\": \"I-405\",\n" +
            "                \"direction\": \"SB\"\n" +
            "            },\n" +
            "            \"1485\": {\n" +
            "                \"title\": \"Weigh in Motion\",\n" +
            "                \"state\": \"California\",\n" +
            "                \"lanes\": null,\n" +
            "                \"latitude\": \"33.75315849820688\",\n" +
            "                \"longitude\": \"-118.01475048065186\",\n" +
            "                \"road_f\": \"Interstate 405\",\n" +
            "                \"road_s\": \"I-405\",\n" +
            "                \"direction\": \"NB\"\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}";

}
*/