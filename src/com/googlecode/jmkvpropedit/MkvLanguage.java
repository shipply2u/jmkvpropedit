package com.googlecode.jmkvpropedit;

/* ISO639 language names and codes
 * Exactly the same used by MKVToolNix
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MkvLanguage {
	private String[] langName = {	"Abkhazian",
									"Achinese",
									"Acoli",
									"Adangme",
									"Adyghe; Adygei",
									"Afar",
									"Afrihili",
									"Afrikaans",
									"Afro-Asiatic languages",
									"Ainu",
									"Akan",
									"Akkadian",
									"Albanian",
									"Aleut",
									"Algonquian languages",
									"Altaic languages",
									"Amharic",
									"Angika",
									"Apache languages",
									"Arabic",
									"Aragonese",
									"Arapaho",
									"Arawak",
									"Armenian",
									"Aromanian; Arumanian; Macedo-Romanian",
									"Artificial languages",
									"Assamese",
									"Asturian; Bable; Leonese; Asturleonese",
									"Athapascan languages",
									"Australian languages",
									"Austronesian languages",
									"Avaric",
									"Avestan",
									"Awadhi",
									"Aymara",
									"Azerbaijani",
									"Balinese",
									"Baltic languages",
									"Baluchi",
									"Bambara",
									"Bamileke languages",
									"Banda languages",
									"Bantu (Other)",
									"Basa",
									"Bashkir",
									"Basque",
									"Batak languages",
									"Beja; Bedawiyet",
									"Belarusian",
									"Bemba",
									"Bengali",
									"Berber languages",
									"Bhojpuri",
									"Bihari languages",
									"Bikol",
									"Bini; Edo",
									"Bislama",
									"Blin; Bilin",
									"Blissymbols; Blissymbolics; Bliss",
									"Bokm�l, Norwegian; Norwegian Bokm�l",
									"Bosnian",
									"Braj",
									"Breton",
									"Buginese",
									"Bulgarian",
									"Buriat",
									"Burmese",
									"Caddo",
									"Catalan; Valencian",
									"Caucasian languages",
									"Cebuano",
									"Celtic languages",
									"Central American Indian languages",
									"Central Khmer",
									"Chagatai",
									"Chamic languages",
									"Chamorro",
									"Chechen",
									"Cherokee",
									"Cheyenne",
									"Chibcha",
									"Chichewa; Chewa; Nyanja",
									"Chinese",
									"Chinook jargon",
									"Chipewyan; Dene Suline",
									"Choctaw",
									"Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic",
									"Chuukese",
									"Chuvash",
									"Classical Newari; Old Newari; Classical Nepal Bhasa",
									"Classical Syriac",
									"Coptic",
									"Cornish",
									"Corsican",
									"Cree",
									"Creek",
									"Creoles and pidgins",
									"Creoles and pidgins, English based",
									"Creoles and pidgins, French-based",
									"Creoles and pidgins, Portuguese-based",
									"Crimean Tatar; Crimean Turkish",
									"Croatian",
									"Cushitic languages",
									"Czech",
									"Dakota",
									"Danish",
									"Dargwa",
									"Delaware",
									"Dinka",
									"Divehi; Dhivehi; Maldivian",
									"Dogri",
									"Dogrib",
									"Dravidian languages",
									"Duala",
									"Dutch, Middle (ca.1050-1350)",
									"Dutch; Flemish",
									"Dyula",
									"Dzongkha",
									"Eastern Frisian",
									"Efik",
									"Egyptian (Ancient)",
									"Ekajuk",
									"Elamite",
									"English",
									"English, Middle (1100-1500)",
									"English, Old (ca.450-1100)",
									"Erzya",
									"Esperanto",
									"Estonian",
									"Ewe",
									"Ewondo",
									"Fang",
									"Fanti",
									"Faroese",
									"Fijian",
									"Filipino; Pilipino",
									"Finnish",
									"Finno-Ugrian languages",
									"Fon",
									"French",
									"French, Middle (ca.1400-1600)",
									"French, Old (842-ca.1400)",
									"Friulian",
									"Fulah",
									"Ga",
									"Gaelic; Scottish Gaelic",
									"Galibi Carib",
									"Galician",
									"Ganda",
									"Gayo",
									"Gbaya",
									"Geez",
									"Georgian",
									"German",
									"German, Middle High (ca.1050-1500)",
									"German, Old High (ca.750-1050)",
									"Germanic languages",
									"Gilbertese",
									"Gondi",
									"Gorontalo",
									"Gothic",
									"Grebo",
									"Greek, Ancient (to 1453)",
									"Greek, Modern (1453-)",
									"Guarani",
									"Gujarati",
									"Gwich'in",
									"Haida",
									"Haitian; Haitian Creole",
									"Hausa",
									"Hawaiian",
									"Hebrew",
									"Herero",
									"Hiligaynon",
									"Himachali languages; Western Pahari languages",
									"Hindi",
									"Hiri Motu",
									"Hittite",
									"Hmong; Mong",
									"Hungarian",
									"Hupa",
									"Iban",
									"Icelandic",
									"Ido",
									"Igbo",
									"Ijo languages",
									"Iloko",
									"Inari Sami",
									"Indic languages",
									"Indo-European languages",
									"Indonesian",
									"Ingush",
									"Interlingua (International Auxiliary Language Association)",
									"Interlingue; Occidental",
									"Inuktitut",
									"Inupiaq",
									"Iranian languages",
									"Irish",
									"Irish, Middle (900-1200)",
									"Irish, Old (to 900)",
									"Iroquoian languages",
									"Italian",
									"Japanese",
									"Javanese",
									"Judeo-Arabic",
									"Judeo-Persian",
									"Kabardian",
									"Kabyle",
									"Kachin; Jingpho",
									"Kalaallisut; Greenlandic",
									"Kalmyk; Oirat",
									"Kamba",
									"Kannada",
									"Kanuri",
									"Kara-Kalpak",
									"Karachay-Balkar",
									"Karelian",
									"Karen languages",
									"Kashmiri",
									"Kashubian",
									"Kawi",
									"Kazakh",
									"Khasi",
									"Khoisan languages",
									"Khotanese; Sakan",
									"Kikuyu; Gikuyu",
									"Kimbundu",
									"Kinyarwanda",
									"Kirghiz; Kyrgyz",
									"Klingon; tlhIngan-Hol",
									"Komi",
									"Kongo",
									"Konkani",
									"Korean",
									"Kosraean",
									"Kpelle",
									"Kru languages",
									"Kuanyama; Kwanyama",
									"Kumyk",
									"Kurdish",
									"Kurukh",
									"Kutenai",
									"Ladino",
									"Lahnda",
									"Lamba",
									"Land Dayak languages",
									"Lao",
									"Latin",
									"Latvian",
									"Lezghian",
									"Limburgan; Limburger; Limburgish",
									"Lingala",
									"Lithuanian",
									"Lojban",
									"Low German; Low Saxon; German, Low; Saxon, Low",
									"Lower Sorbian",
									"Lozi",
									"Luba-Katanga",
									"Luba-Lulua",
									"Luiseno",
									"Lule Sami",
									"Lunda",
									"Luo (Kenya and Tanzania)",
									"Lushai",
									"Luxembourgish; Letzeburgesch",
									"Macedonian",
									"Madurese",
									"Magahi",
									"Maithili",
									"Makasar",
									"Malagasy",
									"Malay",
									"Malayalam",
									"Maltese",
									"Manchu",
									"Mandar",
									"Mandingo",
									"Manipuri",
									"Manobo languages",
									"Manx",
									"Maori",
									"Mapudungun; Mapuche",
									"Marathi",
									"Mari",
									"Marshallese",
									"Marwari",
									"Masai",
									"Mayan languages",
									"Mende",
									"Mi'kmaq; Micmac",
									"Minangkabau",
									"Mirandese",
									"Mohawk",
									"Moksha",
									"Mon-Khmer languages",
									"Mongo",
									"Mongolian",
									"Mossi",
									"Multiple languages",
									"Munda languages",
									"N'Ko",
									"Nahuatl languages",
									"Nauru",
									"Navajo; Navaho",
									"Ndebele, North; North Ndebele",
									"Ndebele, South; South Ndebele",
									"Ndonga",
									"Neapolitan",
									"Nepal Bhasa; Newari",
									"Nepali",
									"Nias",
									"Niger-Kordofanian languages",
									"Nilo-Saharan languages",
									"Niuean",
									"No linguistic content; Not applicable",
									"Nogai",
									"Norse, Old",
									"North American Indian languages",
									"Northern Frisian",
									"Northern Sami",
									"Norwegian Nynorsk; Nynorsk, Norwegian",
									"Norwegian",
									"Nubian languages",
									"Nyamwezi",
									"Nyankole",
									"Nyoro",
									"Nzima",
									"Occitan (post 1500)",
									"Official Aramaic (700-300 BCE); Imperial Aramaic (700-300 BCE)",
									"Ojibwa",
									"Oriya",
									"Oromo",
									"Osage",
									"Ossetian; Ossetic",
									"Otomian languages",
									"Pahlavi",
									"Palauan",
									"Pali",
									"Pampanga; Kapampangan",
									"Pangasinan",
									"Panjabi; Punjabi",
									"Papiamento",
									"Papuan languages",
									"Pedi; Sepedi; Northern Sotho",
									"Persian",
									"Persian, Old (ca.600-400 B.C.)",
									"Philippine languages",
									"Phoenician",
									"Pohnpeian",
									"Polish",
									"Portuguese",
									"Prakrit languages",
									"Proven�al, Old (to 1500);Occitan, Old (to 1500)",
									"Pushto; Pashto",
									"Quechua",
									"Rajasthani",
									"Rapanui",
									"Rarotongan; Cook Islands Maori",
									"Romance languages",
									"Romanian; Moldavian; Moldovan",
									"Romansh",
									"Romany",
									"Rundi",
									"Russian",
									"Salishan languages",
									"Samaritan Aramaic",
									"Sami languages",
									"Samoan",
									"Sandawe",
									"Sango",
									"Sanskrit",
									"Santali",
									"Sardinian",
									"Sasak",
									"Scots",
									"Selkup",
									"Semitic languages",
									"Serbian",
									"Serer",
									"Shan",
									"Shona",
									"Sichuan Yi; Nuosu",
									"Sicilian",
									"Sidamo",
									"Sign Languages",
									"Siksika",
									"Sindhi",
									"Sinhala; Sinhalese",
									"Sino-Tibetan languages",
									"Siouan languages",
									"Skolt Sami",
									"Slave (Athapascan)",
									"Slavic languages",
									"Slovak",
									"Slovenian",
									"Sogdian",
									"Somali",
									"Songhai languages",
									"Soninke",
									"Sorbian languages",
									"Sotho, Southern",
									"South American Indian (Other)",
									"Southern Altai",
									"Southern Sami",
									"Spanish; Castillan",
									"Sranan Tongo",
									"Sukuma",
									"Sumerian",
									"Sundanese",
									"Susu",
									"Swahili",
									"Swati",
									"Swedish",
									"Swiss German; Alemannic; Alsatian",
									"Syriac",
									"Tagalog",
									"Tahitian",
									"Tai languages",
									"Tajik",
									"Tamashek",
									"Tamil",
									"Tatar",
									"Telugu",
									"Tereno",
									"Tetum",
									"Thai",
									"Tibetan",
									"Tigre",
									"Tigrinya",
									"Timne",
									"Tiv",
									"Tlingit",
									"Tok Pisin",
									"Tokelau",
									"Tonga (Nyasa)",
									"Tonga (Tonga Islands)",
									"Tsimshian",
									"Tsonga",
									"Tswana",
									"Tumbuka",
									"Tupi languages",
									"Turkish",
									"Turkish, Ottoman (1500-1928)",
									"Turkmen",
									"Tuvalu",
									"Tuvinian",
									"Twi",
									"Udmurt",
									"Ugaritic",
									"Uighur; Uyghur",
									"Ukrainian",
									"Umbundu",
									"Uncoded languages",
									"Undetermined",
									"Upper Sorbian",
									"Urdu",
									"Uzbek",
									"Vai",
									"Venda",
									"Vietnamese",
									"Volap�k",
									"Votic",
									"Wakashan languages",
									"Walamo",
									"Walloon",
									"Waray",
									"Washo",
									"Welsh",
									"Western Frisian",
									"Wolof",
									"Xhosa",
									"Yakut",
									"Yao",
									"Yapese",
									"Yiddish",
									"Yoruba",
									"Yupik languages",
									"Zande languages",
									"Zapotec",
									"Zaza; Dimili; Dimli; Kirdki; Kirmanjki; Zazaki",
									"Zenaga",
									"Zhuang; Chuang",
									"Zulu",
									"Zuni"	};
		
	private String[] langCode = { 	"abk",
									"ace",
									"ach",
									"ada",
									"ady",
									"aar",
									"afh",
									"afr",
									"afa",
									"ain",
									"aka",
									"akk",
									"alb",
									"ale",
									"alg",
									"tut",
									"amh",
									"anp",
									"apa",
									"ara",
									"arg",
									"arp",
									"arw",
									"arm",
									"rup",
									"art",
									"asm",
									"ast",
									"ath",
									"aus",
									"map",
									"ava",
									"ave",
									"awa",
									"aym",
									"aze",
									"ban",
									"bat",
									"bal",
									"bam",
									"bai",
									"bad",
									"bnt",
									"bas",
									"bak",
									"baq",
									"btk",
									"bej",
									"bel",
									"bem",
									"ben",
									"ber",
									"bho",
									"bih",
									"bik",
									"bin",
									"bis",
									"byn",
									"zbl",
									"nob",
									"bos",
									"bra",
									"bre",
									"bug",
									"bul",
									"bua",
									"bur",
									"cad",
									"cat",
									"cau",
									"ceb",
									"cel",
									"cai",
									"khm",
									"chg",
									"cmc",
									"cha",
									"che",
									"chr",
									"chy",
									"chb",
									"nya",
									"chi",
									"chn",
									"chp",
									"cho",
									"chu",
									"chk",
									"chv",
									"nwc",
									"syc",
									"cop",
									"cor",
									"cos",
									"cre",
									"mus",
									"crp",
									"cpe",
									"cpf",
									"cpp",
									"crh",
									"hrv",
									"cus",
									"cze",
									"dak",
									"dan",
									"dar",
									"del",
									"din",
									"div",
									"doi",
									"dgr",
									"dra",
									"dua",
									"dum",
									"dut",
									"dyu",
									"dzo",
									"frs",
									"efi",
									"egy",
									"eka",
									"elx",
									"eng",
									"enm",
									"ang",
									"myv",
									"epo",
									"est",
									"ewe",
									"ewo",
									"fan",
									"fat",
									"fao",
									"fij",
									"fil",
									"fin",
									"fiu",
									"fon",
									"fre",
									"frm",
									"fro",
									"fur",
									"ful",
									"gaa",
									"gla",
									"car",
									"glg",
									"lug",
									"gay",
									"gba",
									"gez",
									"geo",
									"ger",
									"gmh",
									"goh",
									"gem",
									"gil",
									"gon",
									"gor",
									"got",
									"grb",
									"grc",
									"gre",
									"grn",
									"guj",
									"gwi",
									"hai",
									"hat",
									"hau",
									"haw",
									"heb",
									"her",
									"hil",
									"him",
									"hin",
									"hmo",
									"hit",
									"hmn",
									"hun",
									"hup",
									"iba",
									"ice",
									"ido",
									"ibo",
									"ijo",
									"ilo",
									"smn",
									"inc",
									"ine",
									"ind",
									"inh",
									"ina",
									"ile",
									"iku",
									"ipk",
									"ira",
									"gle",
									"mga",
									"sga",
									"iro",
									"ita",
									"jpn",
									"jav",
									"jrb",
									"jpr",
									"kbd",
									"kab",
									"kac",
									"kal",
									"xal",
									"kam",
									"kan",
									"kau",
									"kaa",
									"krc",
									"krl",
									"kar",
									"kas",
									"csb",
									"kaw",
									"kaz",
									"kha",
									"khi",
									"kho",
									"kik",
									"kmb",
									"kin",
									"kir",
									"tlh",
									"kom",
									"kon",
									"kok",
									"kor",
									"kos",
									"kpe",
									"kro",
									"kua",
									"kum",
									"kur",
									"kru",
									"kut",
									"lad",
									"lah",
									"lam",
									"day",
									"lao",
									"lat",
									"lav",
									"lez",
									"lim",
									"lin",
									"lit",
									"jbo",
									"nds",
									"dsb",
									"loz",
									"lub",
									"lua",
									"lui",
									"smj",
									"lun",
									"luo",
									"lus",
									"ltz",
									"mac",
									"mad",
									"mag",
									"mai",
									"mak",
									"mlg",
									"may",
									"mal",
									"mlt",
									"mnc",
									"mdr",
									"man",
									"mni",
									"mno",
									"glv",
									"mao",
									"arn",
									"mar",
									"chm",
									"mah",
									"mwr",
									"mas",
									"myn",
									"men",
									"mic",
									"min",
									"mwl",
									"moh",
									"mdf",
									"mkh",
									"lol",
									"mon",
									"mos",
									"mul",
									"mun",
									"nqo",
									"nah",
									"nau",
									"nav",
									"nde",
									"nbl",
									"ndo",
									"nap",
									"new",
									"nep",
									"nia",
									"nic",
									"ssa",
									"niu",
									"zxx",
									"nog",
									"non",
									"nai",
									"frr",
									"sme",
									"nno",
									"nor",
									"nub",
									"nym",
									"nyn",
									"nyo",
									"nzi",
									"oci",
									"arc",
									"oji",
									"ori",
									"orm",
									"osa",
									"oss",
									"oto",
									"pal",
									"pau",
									"pli",
									"pam",
									"pag",
									"pan",
									"pap",
									"paa",
									"nso",
									"per",
									"peo",
									"phi",
									"phn",
									"pon",
									"pol",
									"por",
									"pra",
									"pro",
									"pus",
									"que",
									"raj",
									"rap",
									"rar",
									"roa",
									"rum",
									"roh",
									"rom",
									"run",
									"rus",
									"sal",
									"sam",
									"smi",
									"smo",
									"sad",
									"sag",
									"san",
									"sat",
									"srd",
									"sas",
									"sco",
									"sel",
									"sem",
									"srp",
									"srr",
									"shn",
									"sna",
									"iii",
									"scn",
									"sid",
									"sgn",
									"bla",
									"snd",
									"sin",
									"sit",
									"sio",
									"sms",
									"den",
									"sla",
									"slo",
									"slv",
									"sog",
									"som",
									"son",
									"snk",
									"wen",
									"sot",
									"sai",
									"alt",
									"sma",
									"spa",
									"srn",
									"suk",
									"sux",
									"sun",
									"sus",
									"swa",
									"ssw",
									"swe",
									"gsw",
									"syr",
									"tgl",
									"tah",
									"tai",
									"tgk",
									"tmh",
									"tam",
									"tat",
									"tel",
									"ter",
									"tet",
									"tha",
									"tib",
									"tig",
									"tir",
									"tem",
									"tiv",
									"tli",
									"tpi",
									"tkl",
									"tog",
									"ton",
									"tsi",
									"tso",
									"tsn",
									"tum",
									"tup",
									"tur",
									"ota",
									"tuk",
									"tvl",
									"tyv",
									"twi",
									"udm",
									"uga",
									"uig",
									"ukr",
									"umb",
									"mis",
									"und",
									"hsb",
									"urd",
									"uzb",
									"vai",
									"ven",
									"vie",
									"vol",
									"vot",
									"wak",
									"wal",
									"wln",
									"war",
									"was",
									"wel",
									"fry",
									"wol",
									"xho",
									"sah",
									"yao",
									"yap",
									"yid",
									"yor",
									"ypk",
									"znd",
									"zap",
									"zza",
									"zen",
									"zha",
									"zul",
									"zun"	};

	private ArrayList<String> asLangName = new ArrayList<String>(Arrays.asList(langName));
	private ArrayList<String> asLangCode = new ArrayList<String>(Arrays.asList(langCode));
	
	public String[] getLangName() {
		return langName;
	}

	public String[] getLangCode() {
		return langCode;
	}

	public ArrayList<String> getAsLangName() {
		return asLangName;
	}

	public ArrayList<String> getAsLangCode() {
		return asLangCode;
	}
	
	
}
