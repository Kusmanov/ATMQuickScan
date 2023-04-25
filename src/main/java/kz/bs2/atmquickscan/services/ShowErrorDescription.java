package kz.bs2.atmquickscan.services;

import kz.bs2.atmquickscan.enums.CashInErrors;
import kz.bs2.atmquickscan.enums.CashOutErrors;
import kz.bs2.atmquickscan.model.Scod;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ShowErrorDescription {
    public static void execute(TextArea errorDescriptionTextArea, TableView<Scod> scodTable) {
        TableView.TableViewSelectionModel<Scod> sm = scodTable.getSelectionModel();
        ObservableList<Scod> tableViewOL = sm.getSelectedItems();

        if (!tableViewOL.isEmpty()) {
            String cashOutSCOD = tableViewOL.get(0).getCashOut();
            String cashInSCOD = tableViewOL.get(0).getCashIn();
            String cashInECOD = tableViewOL.get(0).getEcod();

            errorDescriptionTextArea.setText(getCashOutErrorDescription(cashOutSCOD, cashInSCOD, cashInECOD));
        }
    }

    private static String getCashOutErrorDescription(String cashOutSCOD, String cashInSCOD, String cashInECOD) {
        String errorDescription = null;

        if (cashOutSCOD != null) {
            switch (cashOutSCOD) {
                case "SCOD=01" -> errorDescription = CashOutErrors.ERROR_01.getDescription();
                case "SCOD=05" -> errorDescription = CashOutErrors.ERROR_05.getDescription();
                case "SCOD=06" -> errorDescription = CashOutErrors.ERROR_06.getDescription();
                case "SCOD=09" -> errorDescription = CashOutErrors.ERROR_09.getDescription();
                case "SCOD=10" -> errorDescription = CashOutErrors.ERROR_10.getDescription();
                case "SCOD=11" -> errorDescription = CashOutErrors.ERROR_11.getDescription();
                case "SCOD=12" -> errorDescription = CashOutErrors.ERROR_12.getDescription();
                case "SCOD=13" -> errorDescription = CashOutErrors.ERROR_13.getDescription();
                case "SCOD=14" -> errorDescription = CashOutErrors.ERROR_14.getDescription();
                case "SCOD=15" -> errorDescription = CashOutErrors.ERROR_15.getDescription();
                case "SCOD=16" -> errorDescription = CashOutErrors.ERROR_16.getDescription();
                case "SCOD=17" -> errorDescription = CashOutErrors.ERROR_17.getDescription();
                case "SCOD=18" -> errorDescription = CashOutErrors.ERROR_18.getDescription();
                case "SCOD=19" -> errorDescription = CashOutErrors.ERROR_19.getDescription();
                case "SCOD=20" -> errorDescription = CashOutErrors.ERROR_20.getDescription();
                case "SCOD=21" -> errorDescription = CashOutErrors.ERROR_21.getDescription();
                case "SCOD=22" -> errorDescription = CashOutErrors.ERROR_22.getDescription();
                case "SCOD=23" -> errorDescription = CashOutErrors.ERROR_23.getDescription();
                case "SCOD=24" -> errorDescription = CashOutErrors.ERROR_24.getDescription();
                case "SCOD=25" -> errorDescription = CashOutErrors.ERROR_25.getDescription();
                case "SCOD=26" -> errorDescription = CashOutErrors.ERROR_26.getDescription();
                case "SCOD=28" -> errorDescription = CashOutErrors.ERROR_28.getDescription();
                case "SCOD=29" -> errorDescription = CashOutErrors.ERROR_29.getDescription();
                case "SCOD=31", "SCOD=32", "SCOD=33", "SCOD=34", "SCOD=35", "SCOD=36"
                        -> errorDescription = CashOutErrors.ERROR_3X.getDescription();
                case "SCOD=41", "SCOD=42", "SCOD=43", "SCOD=44", "SCOD=45", "SCOD=46"
                        -> errorDescription = CashOutErrors.ERROR_4X.getDescription();
                case "SCOD=51", "SCOD=52", "SCOD=53", "SCOD=54", "SCOD=55", "SCOD=56"
                        -> errorDescription = CashOutErrors.ERROR_5X.getDescription();
                case "SCOD=61", "SCOD=62", "SCOD=63", "SCOD=64", "SCOD=65", "SCOD=66"
                        -> errorDescription = CashOutErrors.ERROR_6X.getDescription();
                case "SCOD=70" -> errorDescription = CashOutErrors.ERROR_70.getDescription();
                case "SCOD=71", "SCOD=72", "SCOD=73", "SCOD=74", "SCOD=75", "SCOD=76"
                        -> errorDescription = CashOutErrors.ERROR_7X.getDescription();
                case "SCOD=81", "SCOD=82", "SCOD=83", "SCOD=84", "SCOD=85", "SCOD=86"
                        -> errorDescription = CashOutErrors.ERROR_8X.getDescription();
                case "SCOD=90" -> errorDescription = CashOutErrors.ERROR_90.getDescription();
                case "SCOD=91" -> errorDescription = CashOutErrors.ERROR_91.getDescription();
                case "SCOD=93" -> errorDescription = CashOutErrors.ERROR_93.getDescription();
                case "SCOD=95" -> errorDescription = CashOutErrors.ERROR_95.getDescription();
                case "SCOD=9A" -> errorDescription = CashOutErrors.ERROR_9A.getDescription();
                default -> errorDescription = "There is no description for this error.";
            }
        } else if (cashInSCOD != null && cashInECOD != null) {
            switch (cashInSCOD + "," + cashInECOD) {
                case "SCOD=01,ECOD=0000" -> errorDescription = CashInErrors.ERROR_010000.getDescription();
                case "SCOD=02,ECOD=0020" -> errorDescription = CashInErrors.ERROR_020020.getDescription();
                case "SCOD=05,ECOD=0001" -> errorDescription = CashInErrors.ERROR_050001.getDescription();
                case "SCOD=06,ECOD=0002" -> errorDescription = CashInErrors.ERROR_060002.getDescription();
                case "SCOD=07,ECOD=0003" -> errorDescription = CashInErrors.ERROR_070003.getDescription();
                case "SCOD=08,ECOD=0021" -> errorDescription = CashInErrors.ERROR_080021.getDescription();
                case "SCOD=09,ECOD=0024" -> errorDescription = CashInErrors.ERROR_090024.getDescription();
                case "SCOD=10,ECOD=0000" -> errorDescription = CashInErrors.ERROR_100000.getDescription();
                case "SCOD=11,ECOD=0000" -> errorDescription = CashInErrors.ERROR_110000.getDescription();
                case "SCOD=12,ECOD=0022" -> errorDescription = CashInErrors.ERROR_120022.getDescription();
                case "SCOD=13,ECOD=0000" -> errorDescription = CashInErrors.ERROR_130000.getDescription();
                case "SCOD=14,ECOD=0000" -> errorDescription = CashInErrors.ERROR_140000.getDescription();
                case "SCOD=15,ECOD=0000" -> errorDescription = CashInErrors.ERROR_150000.getDescription();
                case "SCOD=17,ECOD=0023" -> errorDescription = CashInErrors.ERROR_170023.getDescription();
                case "SCOD=18,ECOD=0025" -> errorDescription = CashInErrors.ERROR_180025.getDescription();
                case "SCOD=19,ECOD=0000" -> errorDescription = CashInErrors.ERROR_190000.getDescription();
                case "SCOD=19,ECOD=0144" -> errorDescription = CashInErrors.ERROR_190144.getDescription();
                case "SCOD=20,ECOD=0000" -> errorDescription = CashInErrors.ERROR_200000.getDescription();
                case "SCOD=20,ECOD=0145" -> errorDescription = CashInErrors.ERROR_200145.getDescription();
                case "SCOD=21,ECOD=0000" -> errorDescription = CashInErrors.ERROR_210000.getDescription();
                case "SCOD=21,ECOD=0120" -> errorDescription = CashInErrors.ERROR_210120.getDescription();
                case "SCOD=21,ECOD=0121" -> errorDescription = CashInErrors.ERROR_210121.getDescription();
                case "SCOD=21,ECOD=0122" -> errorDescription = CashInErrors.ERROR_210122.getDescription();
                case "SCOD=21,ECOD=0130" -> errorDescription = CashInErrors.ERROR_210130.getDescription();
                case "SCOD=22,ECOD=0000" -> errorDescription = CashInErrors.ERROR_220000.getDescription();
                case "SCOD=22,ECOD=0100", "SCOD=22,ECOD=0111"
                        -> errorDescription = CashInErrors.ERROR_220100.getDescription();
                case "SCOD=22,ECOD=0108" -> errorDescription = CashInErrors.ERROR_220108.getDescription();
                case "SCOD=22,ECOD=0112" -> errorDescription = CashInErrors.ERROR_220112.getDescription();
                case "SCOD=22,ECOD=0181" -> errorDescription = CashInErrors.ERROR_220181.getDescription();
                case "SCOD=24,ECOD=0000" -> errorDescription = CashInErrors.ERROR_240000.getDescription();
                case "SCOD=24,ECOD=0101" -> errorDescription = CashInErrors.ERROR_240101.getDescription();
                case "SCOD=24,ECOD=0102" -> errorDescription = CashInErrors.ERROR_240102.getDescription();
                case "SCOD=24,ECOD=0103", "SCOD=24,ECOD=0114"
                        -> errorDescription = CashInErrors.ERROR_240103.getDescription();
                case "SCOD=24,ECOD=0105", "SCOD=24,ECOD=0110", "SCOD=24,ECOD=0115"
                        -> errorDescription = CashInErrors.ERROR_240105.getDescription();
                case "SCOD=24,ECOD=0106" -> errorDescription = CashInErrors.ERROR_240106.getDescription();
                case "SCOD=24,ECOD=0113" -> errorDescription = CashInErrors.ERROR_240113.getDescription();
                case "SCOD=24,ECOD=0201" -> errorDescription = CashInErrors.ERROR_240201.getDescription();
                case "SCOD=25,ECOD=0000" -> errorDescription = CashInErrors.ERROR_250000.getDescription();
                case "SCOD=25,ECOD=0150" -> errorDescription = CashInErrors.ERROR_250150.getDescription();
                case "SCOD=25,ECOD=0151" -> errorDescription = CashInErrors.ERROR_250151.getDescription();
                case "SCOD=26,ECOD=0000" -> errorDescription = CashInErrors.ERROR_260000.getDescription();
                case "SCOD=26,ECOD=0116" -> errorDescription = CashInErrors.ERROR_260116.getDescription();
                case "SCOD=26,ECOD=0180" -> errorDescription = CashInErrors.ERROR_260180.getDescription();
                case "SCOD=27,ECOD=0000" -> errorDescription = CashInErrors.ERROR_270000.getDescription();
                case "SCOD=27,ECOD=0140" -> errorDescription = CashInErrors.ERROR_270140.getDescription();
                case "SCOD=27,ECOD=0141" -> errorDescription = CashInErrors.ERROR_270141.getDescription();
                case "SCOD=28,ECOD=0000" -> errorDescription = CashInErrors.ERROR_280000.getDescription();
                case "SCOD=28,ECOD=0200" -> errorDescription = CashInErrors.ERROR_280200.getDescription();
                case "SCOD=28,ECOD=0202" -> errorDescription = CashInErrors.ERROR_280202.getDescription();
                case "SCOD=28,ECOD=0203" -> errorDescription = CashInErrors.ERROR_280203.getDescription();
                case "SCOD=28,ECOD=0204" -> errorDescription = CashInErrors.ERROR_280204.getDescription();
                case "SCOD=28,ECOD=0205" -> errorDescription = CashInErrors.ERROR_280205.getDescription();
                case "SCOD=28,ECOD=0206" -> errorDescription = CashInErrors.ERROR_280206.getDescription();
                case "SCOD=30,ECOD=0000" -> errorDescription = CashInErrors.ERROR_300000.getDescription();
                case "SCOD=30,ECOD=0030" -> errorDescription = CashInErrors.ERROR_300030.getDescription();
                case "SCOD=31,ECOD=0000" -> errorDescription = CashInErrors.ERROR_310000.getDescription();
                case "SCOD=31,ECOD=0040" -> errorDescription = CashInErrors.ERROR_310040.getDescription();
                case "SCOD=31,ECOD=0050" -> errorDescription = CashInErrors.ERROR_310050.getDescription();
                case "SCOD=32,ECOD=0000" -> errorDescription = CashInErrors.ERROR_320000.getDescription();
                case "SCOD=32,ECOD=0045" -> errorDescription = CashInErrors.ERROR_320045.getDescription();
                case "SCOD=32,ECOD=0053" -> errorDescription = CashInErrors.ERROR_320053.getDescription();
                case "SCOD=33,ECOD=0000" -> errorDescription = CashInErrors.ERROR_330000.getDescription();
                case "SCOD=33,ECOD=0041" -> errorDescription = CashInErrors.ERROR_330041.getDescription();
                case "SCOD=33,ECOD=0042" -> errorDescription = CashInErrors.ERROR_330042.getDescription();
                case "SCOD=33,ECOD=0043" -> errorDescription = CashInErrors.ERROR_330043.getDescription();
                case "SCOD=33,ECOD=0044" -> errorDescription = CashInErrors.ERROR_330044.getDescription();
                case "SCOD=33,ECOD=0051" -> errorDescription = CashInErrors.ERROR_330051.getDescription();
                case "SCOD=33,ECOD=0052" -> errorDescription = CashInErrors.ERROR_330052.getDescription();
                case "SCOD=34,ECOD=0000" -> errorDescription = CashInErrors.ERROR_340000.getDescription();
                case "SCOD=34,ECOD=0047" -> errorDescription = CashInErrors.ERROR_340047.getDescription();
                case "SCOD=34,ECOD=0048" -> errorDescription = CashInErrors.ERROR_340048.getDescription();
                case "SCOD=34,ECOD=0049" -> errorDescription = CashInErrors.ERROR_340049.getDescription();
                case "SCOD=34,ECOD=0054" -> errorDescription = CashInErrors.ERROR_340054.getDescription();
                case "SCOD=34,ECOD=0055" -> errorDescription = CashInErrors.ERROR_340055.getDescription();
                case "SCOD=34,ECOD=0056" -> errorDescription = CashInErrors.ERROR_340056.getDescription();
                case "SCOD=40,ECOD=0000" -> errorDescription = CashInErrors.ERROR_400000.getDescription();
                case "SCOD=40,ECOD=0310" -> errorDescription = CashInErrors.ERROR_400310.getDescription();
                case "SCOD=40,ECOD=0311" -> errorDescription = CashInErrors.ERROR_400311.getDescription();
                case "SCOD=40,ECOD=0312" -> errorDescription = CashInErrors.ERROR_400312.getDescription();
                case "SCOD=40,ECOD=0313" -> errorDescription = CashInErrors.ERROR_400313.getDescription();
                case "SCOD=40,ECOD=0324" -> errorDescription = CashInErrors.ERROR_400324.getDescription();
                case "SCOD=40,ECOD=0333" -> errorDescription = CashInErrors.ERROR_400333.getDescription();
                case "SCOD=40,ECOD=0501" -> errorDescription = CashInErrors.ERROR_400501.getDescription();
                case "SCOD=40,ECOD=0502" -> errorDescription = CashInErrors.ERROR_400502.getDescription();
                case "SCOD=41,ECOD=0000" -> errorDescription = CashInErrors.ERROR_410000.getDescription();
                case "SCOD=41,ECOD=0320" -> errorDescription = CashInErrors.ERROR_410320.getDescription();
                case "SCOD=41,ECOD=0321" -> errorDescription = CashInErrors.ERROR_410321.getDescription();
                case "SCOD=41,ECOD=0322" -> errorDescription = CashInErrors.ERROR_410322.getDescription();
                case "SCOD=41,ECOD=0323" -> errorDescription = CashInErrors.ERROR_410323.getDescription();
                case "SCOD=42,ECOD=0000", "SCOD=43,ECOD=0000"
                        -> errorDescription = CashInErrors.ERROR_420000.getDescription();
                case "SCOD=42,ECOD=0301", "SCOD=43,ECOD=0301"
                        -> errorDescription = CashInErrors.ERROR_420301.getDescription();
                case "SCOD=42,ECOD=0302", "SCOD=43,ECOD=0302"
                        -> errorDescription = CashInErrors.ERROR_420302.getDescription();
                case "SCOD=46,ECOD=0000" -> errorDescription = CashInErrors.ERROR_460000.getDescription();
                case "SCOD=46,ECOD=0332" -> errorDescription = CashInErrors.ERROR_460332.getDescription();
                case "SCOD=46,ECOD=0503" -> errorDescription = CashInErrors.ERROR_460503.getDescription();
                case "SCOD=46,ECOD=0504" -> errorDescription = CashInErrors.ERROR_460504.getDescription();
                case "SCOD=47,ECOD=0000" -> errorDescription = CashInErrors.ERROR_470000.getDescription();
                case "SCOD=47,ECOD=0170" -> errorDescription = CashInErrors.ERROR_470170.getDescription();
                case "SCOD=48,ECOD=0000" -> errorDescription = CashInErrors.ERROR_480000.getDescription();
                case "SCOD=48,ECOD=0331" -> errorDescription = CashInErrors.ERROR_480331.getDescription();
                case "SCOD=48,ECOD=0601" -> errorDescription = CashInErrors.ERROR_480601.getDescription();
                case "SCOD=48,ECOD=0602" -> errorDescription = CashInErrors.ERROR_480602.getDescription();
                case "SCOD=50,ECOD=0000" -> errorDescription = CashInErrors.ERROR_500000.getDescription();
                case "SCOD=50,ECOD=0330" -> errorDescription = CashInErrors.ERROR_500330.getDescription();
                case "SCOD=50,ECOD=0402" -> errorDescription = CashInErrors.ERROR_500402.getDescription();
                case "SCOD=50,ECOD=0403" -> errorDescription = CashInErrors.ERROR_500403.getDescription();
                case "SCOD=50,ECOD=0404" -> errorDescription = CashInErrors.ERROR_500404.getDescription();
                case "SCOD=50,ECOD=0405" -> errorDescription = CashInErrors.ERROR_500405.getDescription();
                case "SCOD=50,ECOD=0406" -> errorDescription = CashInErrors.ERROR_500406.getDescription();
                case "SCOD=50,ECOD=0600" -> errorDescription = CashInErrors.ERROR_500600.getDescription();
                case "SCOD=51,ECOD=0000", "SCOD=52,ECOD=0000"
                        -> errorDescription = CashInErrors.ERROR_510000.getDescription();
                case "SCOD=51,ECOD=0400", "SCOD=52,ECOD=0400"
                        -> errorDescription = CashInErrors.ERROR_510400.getDescription();
                case "SCOD=51,ECOD=0401", "SCOD=52,ECOD=0401"
                        -> errorDescription = CashInErrors.ERROR_510401.getDescription();
                case "SCOD=60,ECOD=0065" -> errorDescription = CashInErrors.ERROR_600065.getDescription();
                case "SCOD=61,ECOD=0061" -> errorDescription = CashInErrors.ERROR_610061.getDescription();
                case "SCOD=62,ECOD=0064" -> errorDescription = CashInErrors.ERROR_620064.getDescription();
                case "SCOD=63,ECOD=0062" -> errorDescription = CashInErrors.ERROR_630062.getDescription();
                case "SCOD=63,ECOD=0077" -> errorDescription = CashInErrors.ERROR_630077.getDescription();
                case "SCOD=64,ECOD=0063" -> errorDescription = CashInErrors.ERROR_640063.getDescription();
                case "SCOD=65,ECOD=0075" -> errorDescription = CashInErrors.ERROR_650075.getDescription();
                case "SCOD=66,ECOD=0068" -> errorDescription = CashInErrors.ERROR_660068.getDescription();
                case "SCOD=67,ECOD=0069" -> errorDescription = CashInErrors.ERROR_670069.getDescription();
                case "SCOD=68,ECOD=0067" -> errorDescription = CashInErrors.ERROR_680067.getDescription();
                case "SCOD=69,ECOD=0066" -> errorDescription = CashInErrors.ERROR_690066.getDescription();
                case "SCOD=70,ECOD=0071" -> errorDescription = CashInErrors.ERROR_700071.getDescription();
                case "SCOD=71,ECOD=0070" -> errorDescription = CashInErrors.ERROR_710070.getDescription();
                case "SCOD=72,ECOD=0072" -> errorDescription = CashInErrors.ERROR_720072.getDescription();
                case "SCOD=73,ECOD=0076" -> errorDescription = CashInErrors.ERROR_730076.getDescription();
                case "SCOD=74,ECOD=0073" -> errorDescription = CashInErrors.ERROR_740073.getDescription();
                case "SCOD=75,ECOD=0074" -> errorDescription = CashInErrors.ERROR_750074.getDescription();
                case "SCOD=80,ECOD=0080" -> errorDescription = CashInErrors.ERROR_800080.getDescription();
                case "SCOD=81,ECOD=0081" -> errorDescription = CashInErrors.ERROR_810081.getDescription();
                case "SCOD=82,ECOD=0082" -> errorDescription = CashInErrors.ERROR_820082.getDescription();
                case "SCOD=83,ECOD=0083" -> errorDescription = CashInErrors.ERROR_830083.getDescription();
                case "SCOD=84,ECOD=0084" -> errorDescription = CashInErrors.ERROR_840084.getDescription();
                case "SCOD=85,ECOD=0085" -> errorDescription = CashInErrors.ERROR_850085.getDescription();
                case "SCOD=90,ECOD=0000" -> errorDescription = CashInErrors.ERROR_900000.getDescription();
                case "SCOD=90,ECOD=0603" -> errorDescription = CashInErrors.ERROR_900603.getDescription();
                case "SCOD=90,ECOD=0604" -> errorDescription = CashInErrors.ERROR_900604.getDescription();
                case "SCOD=90,ECOD=0606" -> errorDescription = CashInErrors.ERROR_900606.getDescription();
                case "SCOD=90,ECOD=0609" -> errorDescription = CashInErrors.ERROR_900609.getDescription();
                case "SCOD=90,ECOD=0612" -> errorDescription = CashInErrors.ERROR_900612.getDescription();
                case "SCOD=91,ECOD=0000" -> errorDescription = CashInErrors.ERROR_910000.getDescription();
                case "SCOD=91,ECOD=0614" -> errorDescription = CashInErrors.ERROR_910614.getDescription();
                case "SCOD=91,ECOD=0618" -> errorDescription = CashInErrors.ERROR_910618.getDescription();
                case "SCOD=92,ECOD=0000" -> errorDescription = CashInErrors.ERROR_920000.getDescription();
                case "SCOD=92,ECOD=0608" -> errorDescription = CashInErrors.ERROR_920608.getDescription();
                case "SCOD=92,ECOD=0610" -> errorDescription = CashInErrors.ERROR_920610.getDescription();
                case "SCOD=93,ECOD=0000" -> errorDescription = CashInErrors.ERROR_930000.getDescription();
                case "SCOD=93,ECOD=0615" -> errorDescription = CashInErrors.ERROR_930615.getDescription();
                case "SCOD=94,ECOD=0000" -> errorDescription = CashInErrors.ERROR_940000.getDescription();
                case "SCOD=94,ECOD=0611" -> errorDescription = CashInErrors.ERROR_940611.getDescription();
                case "SCOD=94,ECOD=0613" -> errorDescription = CashInErrors.ERROR_940613.getDescription();
                case "SCOD=95,ECOD=0000" -> errorDescription = CashInErrors.ERROR_950000.getDescription();
                case "SCOD=95,ECOD=0616" -> errorDescription = CashInErrors.ERROR_950616.getDescription();
                case "SCOD=96,ECOD=0000" -> errorDescription = CashInErrors.ERROR_960000.getDescription();
                case "SCOD=96,ECOD=0605" -> errorDescription = CashInErrors.ERROR_960605.getDescription();
                case "SCOD=96,ECOD=0607" -> errorDescription = CashInErrors.ERROR_960607.getDescription();
                case "SCOD=96,ECOD=0617" -> errorDescription = CashInErrors.ERROR_960617.getDescription();
                default -> errorDescription = "There is no description for this error.";
            }
        }

        return errorDescription;
    }
}
