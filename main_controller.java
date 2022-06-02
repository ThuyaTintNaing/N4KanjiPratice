package javafx_project;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;

public class main_controller implements Initializable {
	@FXML
	private JFXComboBox<Integer> combo1;

	@FXML
	private JFXButton buttonkana;

	@FXML
	private JFXButton buttkenji;

	@FXML
	private JFXButton buttmeaing;

	@FXML
	private JFXButton ranbutt;

	@FXML
	private Text totalnum;

	private int selected_lesson;
	private String meaningdata;
	private String hanadata;
	List<String> list_kenji = Arrays.asList("料理", "反", "飯", "ご飯", "朝ご飯", "昼ご飯", "晩ご飯", "牛", "牛肉", "豚", "豚肉", "鳥", "小鳥",
			"鳥肉", "肉", "お茶", "茶色", "予", "野菜", "長野", "切る", "切手", "大切な", "作る", "手作り", "未来", "味", "料", "理", "野", "菜");

	List<String> list_meaing = Arrays.asList("dish", "*to oppose", "*cooked rice", "cooked rice", "breakfast", "lunch",
			"dinner", "cow", "beef", "pig", "pork", "bird", "little bird", "chicken", "meat", "japanese tea", "brown",
			"*plan", "vegetable", "Nagano", "to cut", "postage stamp", "precious", "to make", "handmade", "future",
			"taste", "*dish", "*dish", "*vegetable", "*vegetable");

	List<String> list_hana = Arrays.asList("りょうり", "はん＞はんたいする", "はん＞ごはん", "ごはん", "あさごはん", "ひるごはん", "ばんごはん", "うし",
			"ぎゅうにく", "ぶた", "ぶたにく", "とり", "ことり", "とりにく", "にく", "おちゃ", "ちゃいろ", "よ＞よてい", "やさい", "ながの", "きる", "きって",
			"たいせつな", "つくる", "てづくり", "みらい", "あじ", "りょう＞りょうり", "り＞りょうり", "や>やさい", "さい＞やさい");

	List<String> les12_kenji = Arrays.asList("音楽", "音", "楽しい", "楽しみ", "歌", "歌う", "歌手", "自分", "自転車", "乗る", "写真", "写す",
			"真ん中", "二台", "映画", "羊", "洋服", "服", "着る", "上着", "下着", "着く");

	List<String> les12_meaning = Arrays.asList("music", "sound", "enjoyable", "fun", "song", "to sing", "singer",
			"oneself", "bicycel", "to ride", "photograph", "to copy", "center", "two(machines)", "movie", "sheep",
			"western clothes", "clothes", "to wear", "jacket", "underwear", "to arrive");

	List<String> les12_hana = Arrays.asList("おんがく", "おと", "たのしい", "たのしみ", "うた", "うたい", "かしゅ", "じぶん", "じてんしゃ", "のる",
			"しゃしん", "うつす", "まんなか", "にだい", "えいが", "ひつじ", "じょうふく", "ふく", "きる", "うわぎ", "したぎ", "つく");

	List<String> les13_meaning = Arrays.asList("house", "family", "arrow", "parent", "kind", "my older brother",
			"older brother", "siblings", "my older sister", "older sister", "younger brother", "younger sister", "I",
			"my husband", "my wife", "my husband", "to live", "thread", "full name", "paper", "letter");

	List<String> les13_hana = Arrays.asList("いえ", "かぞく", "や", "おや", "しんせつな", "あに", "おにいさん", "きょうだい", "あね", "おねえさん",
			"おとうと", "いもうと", "わたし", "おっと", "つま", "しゅじん", "すむ", "いと", "しめい", "かみ", "てがみ");

	List<String> les13_kenji = Arrays.asList("家", "家族", "矢", "親", "親切な", "兄", "お兄さん", "兄弟", "姉", "お姉さん", "弟", "妹", "私",
			"夫", "妻", "主人", "住む", "糸", "氏名", "紙", "手紙");

	List<String> les14_meaning = Arrays.asList("to teach", "classroom", "church", "wing,feather", "to learn",
			"chinese character", "character", "entrance ceremony", "examination", "homework", "problem,question",
			"literature", "composition", "culture", "English", "question", "explanation", "novel");

	List<String> les14_hana = Arrays.asList("おしえる", "きょうしつ", "きょうかい", "はね", "ならう", "かんじ", "じ", "" + "にゅうがくしき", "しけん",
			"しゅくだい", "もんだい", "ぶんがく", "さくぶん", "ぶんか", "えいご", "しつもん", "せつめい", "しょうせつ");

	List<String> les14_kenji = Arrays.asList("教える", "教室", "教会", "羽", "習う", "漢字", "字", "入学式", "試験", "宿題", "問題", "文学",
			"作文", "文化", "英語", "質問", "説明", "小説");

	List<String> les15_kenji = Arrays.asList("遠い", "遠く", "近い", "近く", "学者", "作者", "暑い", "寒い", "重い", "軽い", "低い", "弱い",
			"悪い", "暗い", "太い", "太る", "豆", "短い", "光", "光る", "風", "台風");

	List<String> les15_hana = Arrays.asList("とおい", "とおく", "ちかい", "ちかく", "がくしゃ", "さくしゃ", "あつい", "さむい", "おもい", "かるい",
			"ひくい", "よわい", "わるい", "くらい", "ふとい", "ふとる", "まめ", "みじかい", "ひかり", "ひかる", "かぜ", "たいふう");

	List<String> les15_meaning = Arrays.asList("far", "far place", "near", "nearby", "scholar", "author", "hot", "cold",
			"heavy", "light", "low", "weak", "bad", "dark", "thick", "to gain weight", "bean", "short", "light",
			"to shine", "wind", "typhoon");
	List<String> les16_kenji = Arrays.asList("運ぶ", "運転", "運転手", "運動", "動く", "自動車", "止まる", "止める", "中止", "歩く", "使う", "送る",
			"洗う", "お手洗い", "急に", "急ぐ", "急行", "開く", "開ける", "開く", "閉まる", "閉める", "押す", "引く", "引き出し", "思う", "思い出す", "思い出",
			"知る", "知らせる", "考える", "考え", "死ね");

	List<String> les16_hana = Arrays.asList("はこぶ", "うんてん", "うんてんしゅ", "うんどう", "うごく", "じどうしゃ", "とまる", "とめる", "ちゅうし",
			"あるく", "つかう", "おくる", "あらう", "おてあらい", "きゅうに", "いそぐ", "きゅうこう", "あく", "あける", "ひらく", "しまる", "しめる", "おす", "ひく",
			"ひきだし", "おもう", "おもいだす", "おもいで", "しる", "しらせる", "かんがえる", "かんがえ", "しね");

	List<String> les16_meaning = Arrays.asList("to carry", "driving", "driver", "physical exercise", "to move",
			"automobile", "(something)stop", "to stop(something)", "cancellation", "to walk", "to use", "to send",
			"to wash", "restroom", "suddenly", "to hurry", "express(train)", "(something)open", "to open(something)",
			"to open(something)", "(something)closes", "to close(something)", "to push,to press", "to pull", "drawer",
			"to think", "to recall", "memory", "to know", "to noise", "to think", "idea", "to die");

	List<String> les17_hana = Arrays.asList("いしゃ", "いがく", "はじまる", "はじめる", "おわる", "おわり", "いし", "けんきゅう", "けんきゅうしゃ",
			"けんきゅうしつ", " りゅうがくする", "りゅうがくせい", "ゆうめいな", "きんぎょう", "せいさん", "こうぎょう", "くすい", "はたらく", "かいしゃいん", "てんいん",
			"ぎんこういん", "し＜ぶし", "しごと", "こと", "かじ", "しょくじ");

	List<String> les17_meaning = Arrays.asList("doctor", "medical science", "(something)begins", "to begin(something)",
			"to come to an end", "end", "stone", "research", " researcher", "research room", " to study abroad",
			"international student", "famous", "industry", "production", "manufacturing industry", "medicine",
			"to work", "office worker", "store clerk", "bank employee", "samurai,warrior", "job", "thing", "fire",
			"meal");

	List<String> les17_kenji = Arrays.asList("医者", "医学", "始まる", "始める", "終わる", "終わり", "石", "研究", "研究者", "研究室", " 留学する",
			"留学生", "有名な", "産業", "生産", "工業", "薬", "働く", "会社員", "店員", "銀行員", "士", "仕事", "事", "火事", "食事");

	List<String> les18_kenji = Arrays.asList("図書館", "地図", "長官", "映画館", "大使館", "昔", "借りる", "時代", "電気代", "代わりに", "貸す",
			"地理", "地下", "世界", "世話", "一度", "今度", "三十度", "一回", "何回", "回る", "用", "用事", "用意する", "市民", "注意する", "注文する", "意味",
			"意見");

	List<String> les18_hana = Arrays.asList("としょかん", "ちず", "ちょうかん", "えいがかん", "たいしかん", "むかし", "かりる", "じだい", "でんきだい",
			"かわりに", "かす", "ちり", "ちか", "せかい", "せわ", "いちど", "こんど", "さんじゅうど", "いっかい", "なんかい", "まわる", "よう", "ようじ", "よういする",
			"しみん", "ちゅういする", "ちゅうもんする", "いみ", "いけん");

	List<String> les18_meaning = Arrays.asList("library", "map", "director general", "movie theater", "embassy",
			"old times", "to borrow", "age,era", "electricity fee", "instead", "to lend", "geography", "underground",
			"the world", "care", "once", "next time,near future", "30 degress", "once", "how many times", "to turn",
			"errand", "businees", "to prepare", "citizen", "to warn", "to order", "meaning", "opinion");

	List<String> les19_kenji = Arrays.asList("頭", "顔", "声", "特別な", "特に", "別れる", "別に", "別の", "竹", "会う", "試合", "間に合う",
			"答える", "答え", "お正月", "正しい", "正式な", "正午", "同じ", "時計", "計画", "東京", "集める", "集まる", "不便な", "以上", "以下", "以外");

	List<String> les19_hana = Arrays.asList("あたま", "かお", "こえ", "とくべつな", "とくに", "わかれる", "べつに", "べつの", "たけ", "あう", "しあい",
			"まにあう", "こたえる", "こたえ", "おしょうがつ", "ただしい", "せいしきな", "しょうご", "おなじ", "とけい", "けいかく", "とうきょう", "あつめる", "あつまる",
			"ふべんな", "いじょう", "いか", "いがい");

	List<String> les19_meaning = Arrays.asList("head", "face", "voice", "special", "especially", "to seperate",
			"not in particular", "another", "bamboo", "to fit", "game,match", "to be in time", "to answer", "answer",
			"New Year's holiday", "right", "formal", "noon", "same", "clock,watch", "plan", "Tokyo", "to collect",
			"to gather", "inconvenient", "... or more", "...or less", "other than ...");

	List<String> les20_kenji = Arrays.asList("場所", "場合", "会場", "工場", "売り場", "戸", "どんな所", "台所", "住所", "近所", "本屋", "屋上",
			"食堂", "東京都", "首都", "都合", "京都", "長野県", "北区", "池", "電池", "発音", "出発", "建てる", "建物", "物", "食べ物", "飲み物", "買い物",
			"着物", "品物", "旅行", "旅館", "通る", "通う", "通り", "進む", "動物");

	List<String> les20_hana = Arrays.asList("ばしょ", "ばあい", "かいじょう", "こうじょう", "うりば", "と", "どんなところ", "だいどころ", "じゅうしょ",
			"きんじょ", "ほんや", "おくじょう", "しょくどう", "とうきょうと", "しゅと", "つごう", "きょうと", "ながのけん", "きたく", "いけ", "でんち", "はつおん",
			"しゅっぱつ", "たてる", "たてもの", "もの", "たべもの", "のみもの", "かいもの", "きもの", "しなもの", "りょこう", "りょかん", "とおる", "かよう", "とおり",
			"すすむ", "どうぶつ");

	List<String> les20_meaning = Arrays.asList("place", "case", "meeting place", "factory", "counter,shop", "door",
			"what kind of place", "kitchen", "address", "neighborhood", "bookstore", "rooftop", "cafeteria",
			"Metropolis of Tokyo", "capital", "convenience", "Kyoto", "Nagano Prefecture", "Kita Ward", "pond",
			"battery", "pronunciation", "departure", "to build", "building", "thing", "food", "drink", "shopping",
			"kimono", "goods", "travel", "Japanese inn", "to go through,to pass", "to commute", "street",
			"(something)advances", "animal");

	ArrayList<String> arr_kenji = new ArrayList<String>();
	ArrayList<String> arr_meaning = new ArrayList<String>();
	ArrayList<String> arr_hana = new ArrayList<String>();

	@FXML
	void actionlessonselect(ActionEvent event) {
		selected_lesson = combo1.getSelectionModel().getSelectedItem();
		if (selected_lesson == 11) {

			remakelist(list_kenji, list_meaing, list_hana);
			conditiontask();

		} else if (selected_lesson == 12) {

			remakelist(les12_kenji, les12_meaning, les12_hana);
			conditiontask();
		} else if (selected_lesson == 13) {

			remakelist(les13_kenji, les13_meaning, les13_hana);
			conditiontask();
		} else if (selected_lesson == 14) {

			remakelist(les14_kenji, les14_meaning, les14_hana);
			conditiontask();
		} else if (selected_lesson == 15) {

			remakelist(les15_kenji, les15_meaning, les15_hana);
			conditiontask();
		} else if (selected_lesson == 16) {

			remakelist(les16_kenji, les16_meaning, les16_hana);
			conditiontask();
		} else if (selected_lesson == 17) {

			remakelist(les17_kenji, les17_meaning, les17_hana);
			conditiontask();
		} else if (selected_lesson == 18) {

			remakelist(les18_kenji, les18_meaning, les18_hana);
			conditiontask();
		} else if (selected_lesson == 19) {

			remakelist(les19_kenji, les19_meaning, les19_hana);
			conditiontask();
		} else if (selected_lesson == 20) {

			remakelist(les20_kenji, les20_meaning, les20_hana);
			conditiontask();
		} else {
			changetext();
			totalnum.setText("8");
		}
	}

	@FXML
	void randomaction(ActionEvent event) {

		if (combo1.getValue() == null) {
			new Alert(AlertType.INFORMATION, "Choose the lesson number first", javafx.scene.control.ButtonType.OK)
					.showAndWait();
		} else {

			if (selected_lesson == 11) {

				conditiontask();
			} else if (selected_lesson == 12) {

				conditiontask();
			} else if (selected_lesson == 13) {

				conditiontask();
			} else if (selected_lesson == 14) {

				conditiontask();
			} else if (selected_lesson == 15) {

				conditiontask();
			} else if (selected_lesson == 16) {

				conditiontask();
			} else if (selected_lesson == 17) {

				conditiontask();
			} else if (selected_lesson == 18) {

				conditiontask();
			} else if (selected_lesson == 19) {

				conditiontask();
			} else if (selected_lesson == 20) {

				conditiontask();
			}
		}
	}

	@FXML
	void actionmeaning(ActionEvent event) {

		if (combo1.getValue() == null) {
			new Alert(AlertType.INFORMATION, "Choose the lesson number first", javafx.scene.control.ButtonType.OK)
					.showAndWait();
		} else {
			if (!buttkenji.getText().equals("Kanji")) {
				buttmeaing.setText(meaningdata);
			} else {
				buttmeaing.setText("Meaning");
			}

		}

	}

	@FXML
	void actionkana(ActionEvent event) {
		if (combo1.getValue() == null) {
			new Alert(AlertType.INFORMATION, "Choose the lesson number first", javafx.scene.control.ButtonType.OK)
					.showAndWait();
		} else {
			if (!buttkenji.getText().equals("Kanji")) {
				buttonkana.setText(hanadata);
			} else {
				buttonkana.setText("Hiragana");
			}

		}
	}

	@FXML
	void actionReset(ActionEvent event) {
		if (combo1.getValue() == null) {
			new Alert(AlertType.INFORMATION, "Choose the lesson number first", javafx.scene.control.ButtonType.OK)
					.showAndWait();
		} else {
			if (selected_lesson == 11) {

				remakelist(list_kenji, list_meaing, list_hana);
				conditiontask();

			} else if (selected_lesson == 12) {

				remakelist(les12_kenji, les12_meaning, les12_hana);
				conditiontask();
			} else if (selected_lesson == 13) {

				remakelist(les13_kenji, les13_meaning, les13_hana);
				conditiontask();
			} else if (selected_lesson == 14) {

				remakelist(les14_kenji, les14_meaning, les14_hana);
				conditiontask();
			} else if (selected_lesson == 15) {

				remakelist(les15_kenji, les15_meaning, les15_hana);
				conditiontask();
			} else if (selected_lesson == 16) {

				remakelist(les16_kenji, les16_meaning, les16_hana);
				conditiontask();
			} else if (selected_lesson == 17) {

				remakelist(les17_kenji, les17_meaning, les17_hana);
				conditiontask();
			} else if (selected_lesson == 18) {

				remakelist(les18_kenji, les18_meaning, les18_hana);
				conditiontask();
			} else if (selected_lesson == 19) {

				remakelist(les19_kenji, les19_meaning, les19_hana);
				conditiontask();
			} else if (selected_lesson == 20) {

				remakelist(les20_kenji, les20_meaning, les20_hana);
				conditiontask();
			}

		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		combo1.getItems().addAll(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		combo1.setVisibleRowCount(6);

	}

	void remakelist(List<String> kenjiList, List<String> meaninglist, List<String> hanalist) {
		Iterator<String> itr1 = arr_kenji.iterator();
		Iterator<String> itr2 = arr_meaning.iterator();
		Iterator<String> itr3 = arr_hana.iterator();

		while (itr1.hasNext()) {
			if (itr1.next() != null) {
				itr1.remove();
			}
		}
		arr_kenji.addAll(kenjiList);
		while (itr2.hasNext()) {
			if (itr2.next() != null) {
				itr2.remove();
			}
		}
		arr_meaning.addAll(meaninglist);
		while (itr3.hasNext()) {
			if (itr3.next() != null) {
				itr3.remove();
			}
		}
		arr_hana.addAll(hanalist);
	}

	void changetext() {
		buttkenji.setText("???");
		buttmeaing.setText("Meaning");
		buttonkana.setText("Hiragana");
	}

	void conditiontask() {
		Random ran = new Random();

		int arr_size = arr_kenji.size();
		if (arr_size > 0) {
			String result = arr_kenji.get(ran.nextInt(arr_size));
			buttkenji.setText(result);
			int index1 = arr_kenji.indexOf(result);

			System.out.println(index1);

			meaningdata = arr_meaning.get(index1);
			hanadata = arr_hana.get(index1);
			buttkenji.setText(result);
			buttmeaing.setText("???");
			buttonkana.setText("???");
			arr_kenji.remove(index1);
			arr_meaning.remove(index1);
			arr_hana.remove(index1);

			totalnum.setText("" + arr_kenji.size());

		}

		else {
			buttkenji.setText("Kanji");
			buttmeaing.setText("Meaning");
			buttonkana.setText("Hiragana");
			new Alert(AlertType.CONFIRMATION,
					"You completed kenji lesson -" + selected_lesson
							+ "! Choose the another lesson or reset the lesson.",
					javafx.scene.control.ButtonType.OK).showAndWait();

		}
	}

}
