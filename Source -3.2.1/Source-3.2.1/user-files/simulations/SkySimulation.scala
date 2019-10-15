
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SkySimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://skynews.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36")

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
		"Sec-Fetch-Mode" -> "no-cors")

	val headers_3 = Map("Sec-Fetch-Mode" -> "no-cors")

	val headers_77 = Map(
		"Origin" -> "https://news.sky.com",
		"Sec-Fetch-Mode" -> "cors")

	val headers_87 = Map("Sec-Fetch-Mode" -> "cors")

	val headers_106 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "https://news.sky.com",
		"Sec-Fetch-Mode" -> "cors")

	val headers_110 = Map(
		"Content-Type" -> "application/json; charset=UTF-8",
		"Origin" -> "https://news.sky.com",
		"Sec-Fetch-Mode" -> "cors")

	val headers_122 = Map(
		"Accept" -> "text/*",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://news.sky.com",
		"Sec-Fetch-Mode" -> "cors")

	val headers_123 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://news.sky.com",
		"Sec-Fetch-Mode" -> "cors")

	val headers_130 = Map("Sec-Fetch-Mode" -> "same-origin")

    val uri01 = "https://zagent866.h-cdn.com/cmd/get_links_info"
    val uri03 = "https://ping.chartbeat.net/ping"
    val uri04 = "https://assets.adobedtm.com/ea8b05805335bbbe5843bc504517194c8ae74941"
    val uri05 = "https://www.adobe.com/privacy/experience-cloud.html"
    val uri06 = "https://zagent231.h-cdn.com/cmd/get_links_info"
    val uri07 = "https://mabping.chartbeat.net/ping/mab"
    val uri08 = "https://analytics.faw.sky.com/ingest/web-view-message/447"
    val uri09 = "https://zagent1934.h-cdn.com/cmd/get_links_info"
    val uri10 = "https://smetrics.sky.com/b/ss/bskybdtmskynewsprod,bskybskynews/1/JS-2.9.0-D7QN/s54199495898270"
    val uri11 = "https://components.news.sky.com/files"
    val uri12 = "https://player.h-cdn.com"
    val uri13 = "https://sb.scorecardresearch.com"
    val uri14 = "https://e3.365dm.com"
    val uri15 = "https://securepubads.g.doubleclick.net"
    val uri16 = "https://mms.cmpsky.com"
    val uri17 = "https://adservice.google.com/adsid/integrator.js"
    val uri18 = "https://news.sky.com"
    val uri19 = "https://perr.h-cdn.com/be_client_cgi/perr"
    val uri20 = "https://static.chartbeat.com/js"
    val uri21 = "https://www.googletagservices.com/tag/js/gpt.js"
    val uri22 = "https://player2.h-cdn.com/svc/cdn/pub/css/previews_widget.css"
    val uri23 = "https://zagent892.h-cdn.com/cmd/get_links_info"
    val uri24 = "https://sourcepoint.mgr.consensu.org/consent/v2"
    val uri25 = "https://mab.chartbeat.com/mab_strategy/headline_testing/get_strategy"
    val uri26 = "https://zagent119.h-cdn.com/cmd/get_links_info"

	val scn = scenario("SkySimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri04 + "/scripts/satellite-5aa930d364746d58b4004dc9.js")
			.headers(headers_1),
            http("request_2")
			.get(uri04 + "/scripts/satellite-5aa930d364746d58b4004dca.js")
			.headers(headers_1),
            http("request_3")
			.get(uri14 + "/19/09/384x216/skynews-boris-johnson-tory_4790983.png?20190930115457")
			.headers(headers_3),
            http("request_4")
			.get(uri14 + "/19/09/384x216/skynews-donald-trump-us-president_4790753.jpg?20190930040428")
			.headers(headers_3),
            http("request_5")
			.get(uri14 + "/19/09/384x216/skynews-police-west-midlands_4790820.jpg?20190930093038")
			.headers(headers_3),
            http("request_6")
			.get(uri14 + "/19/09/384x216/skynews-china-fugitive_4790830.jpg?20190930093851")
			.headers(headers_3),
            http("request_7")
			.get(uri14 + "/19/09/384x216/skynews-uighur-china_4790309.jpg?20190929215928")
			.headers(headers_3),
            http("request_8")
			.get(uri14 + "/17/01/384x216/dd12f84a7d8c9c78bb2ac02a11cb411c40f2d5bffeb8ecf85337049a917361d6_3866131.jpg?20170107172121")
			.headers(headers_3),
            http("request_9")
			.get(uri14 + "/19/09/384x216/skynews-x-factor-cole-foden_4790834.jpg?20190930094039")
			.headers(headers_3),
            http("request_10")
			.get(uri14 + "/19/09/384x216/skynews-london-stabbing_4790880.jpg?20190930102508")
			.headers(headers_3),
            http("request_11")
			.get(uri14 + "/19/09/384x216/skynews-pakistan-mountains_4790949.jpg?20190930113142")
			.headers(headers_3),
            http("request_12")
			.get(uri14 + "/19/09/384x216/skynews-javid-boris_4790897.jpg?20190930104142")
			.headers(headers_3),
            http("request_13")
			.get(uri20 + "/chartbeat_mab.js")
			.headers(headers_3),
            http("request_14")
			.get(uri14 + "/19/09/384x216/skynews-hong-kong-rubber-bullet_4790863.jpg?20190930100648")
			.headers(headers_3),
            http("request_15")
			.get(uri14 + "/19/09/384x216/b2f16d715dd5ab4216903330ca110c90e3b1ddd6a3d100d3a5d55d2a20b0afd3_4790754.jpg?20190930051845")
			.headers(headers_3),
            http("request_16")
			.get(uri14 + "/19/09/384x216/skynews-bethany-marchant-stefan-carr_4786252.jpg?20190925180255")
			.headers(headers_3),
            http("request_17")
			.get(uri14 + "/19/09/384x216/skynews-julie-burns-thomas-cook_4785329.jpg?20190924175545")
			.headers(headers_3),
            http("request_18")
			.get(uri14 + "/19/09/384x216/skynews-safe-houses-knife-crime_4777535.jpg?20190917161341")
			.headers(headers_3),
            http("request_19")
			.get(uri14 + "/19/09/384x216/skynews-iraq-war-graves_4790913.jpg?20190930104900")
			.headers(headers_3),
            http("request_20")
			.get(uri14 + "/19/09/384x216/skynews-youtube-music-google_4790865.jpg?20190930101022")
			.headers(headers_3),
            http("request_21")
			.get(uri14 + "/19/09/384x216/skynews-forever-21-retail-london_4790886.jpg?20190930110809")
			.headers(headers_3),
            http("request_22")
			.get(uri14 + "/19/06/384x216/skynews-jamal-khashoggi-saudi_4697692.jpg?20190619121141")
			.headers(headers_3),
            http("request_23")
			.get(uri14 + "/19/09/384x216/skynews-helen-mirren-sky-catherine-the-great_4788243.jpg?20190927181457")
			.headers(headers_3),
            http("request_24")
			.get(uri14 + "/18/03/384x216/skynews-prudential-insurer_4255050.jpg?20180314112519")
			.headers(headers_3),
            http("request_25")
			.get(uri14 + "/19/09/384x216/skynews-prince-harry-duke-sussex_4790757.jpg?20190930045755")
			.headers(headers_3),
            http("request_26")
			.get(uri14 + "/19/09/384x216/skynews-caster-semenya-sky-views_4790742.jpg?20190930023855")
			.headers(headers_3),
            http("request_27")
			.get(uri14 + "/19/09/384x216/skynews-thomas-cook_4790000.jpg?20190929142312")
			.headers(headers_3),
            http("request_28")
			.get(uri14 + "/19/09/384x216/skynews-woman-herat-attack_4790796.jpg?20190930073159")
			.headers(headers_3),
            http("request_29")
			.get(uri14 + "/19/09/384x216/2371909290879089507_4789734.jpg?20190929084136")
			.headers(headers_3),
            http("request_30")
			.get(uri14 + "/19/09/384x216/skynews-trafficking-wmp-taxi_4790982.jpg?20190930115358")
			.headers(headers_3),
            http("request_31")
			.get(uri14 + "/19/09/384x216/3d7cc46ba71f43e14d5e076b1c6d972e4a4c1c1672eb73567b82755495aa148b_4790720.jpg?20190930000359")
			.headers(headers_3),
            http("request_32")
			.get(uri14 + "/19/09/384x216/skynews-uighur-china_4790308.jpg?20190929180102")
			.headers(headers_3),
            http("request_33")
			.get(uri14 + "/19/09/384x216/skynews-illinois-car-vehicle_4790192.jpg?20190929163351")
			.headers(headers_3),
            http("request_34")
			.get(uri14 + "/19/09/384x216/skynews-tom-cheshire-sky-views_4789620.jpg?20190929000802")
			.headers(headers_3),
            http("request_35")
			.get(uri14 + "/19/09/384x216/skynews-sky-views-adam-boulton_4788490.jpg?20190928053806")
			.headers(headers_3),
            http("request_36")
			.get(uri14 + "/19/09/384x216/skynews-ian-king-sky-views_4787477.jpg?20190927042833")
			.headers(headers_3),
            http("request_37")
			.get(uri14 + "/19/09/384x216/skynews-rowland-manthorpe-sky-views_4786557.jpg?20190925235305")
			.headers(headers_3),
            http("request_38")
			.get(uri14 + "/19/03/384x216/skynews-sros-ridge-podcast_4621727.png?20190328171031")
			.headers(headers_3),
            http("request_39")
			.get(uri14 + "/19/02/384x216/skynews-daily-podcast_4581724.jpg?20190218090500")
			.headers(headers_3),
            http("request_40")
			.get(uri14 + "/19/02/384x216/skynews-aop-podcast_4585272.jpg?20190221154607")
			.headers(headers_3),
            http("request_41")
			.get(uri14 + "/19/05/384x216/skynews-the-pledge-nick-ferrari_4671283.jpg?20190517100908")
			.headers(headers_3),
            http("request_42")
			.get(uri14 + "/19/06/384x216/skynews-rachel-johnson-the-pledge_4693814.jpg?20190613184412")
			.headers(headers_3),
            http("request_43")
			.get(uri14 + "/19/05/384x216/trevorphillips-thepledge-skynews_4682384.jpg?20190530170643")
			.headers(headers_3),
            http("request_44")
			.get(uri14 + "/19/03/384x216/skynews-michelle-the-pledge_4619929.jpg?20190326181252")
			.headers(headers_3),
            http("request_45")
			.get(uri14 + "/19/05/384x216/skynews-carole-malone-the-pledge_4671275.jpg?20190517100000")
			.headers(headers_3),
            http("request_46")
			.get(uri14 + "/19/07/384x216/skynews-hotspots-sudan_4713955.jpg?20190709175417")
			.headers(headers_3),
            http("request_47")
			.get(uri14 + "/19/07/384x216/skynews-hotspots-venezuela_4706994.jpg?20190701162516")
			.headers(headers_3),
            http("request_48")
			.get(uri14 + "/19/06/384x216/skynews-hotspots-refugee-crisis_4698406.jpg?20190620131859")
			.headers(headers_3),
            http("request_49")
			.get(uri14 + "/19/06/384x216/skynews-hotspots-mexico-us-border_4693046.jpg?20190612153606")
			.headers(headers_3),
            http("request_50")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-mexico_4619656.jpg?20190326125256")
			.headers(headers_3),
            http("request_51")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-is-torture-chamber_4619655.jpg?20190326125228")
			.headers(headers_3),
            http("request_52")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-drc-dorsen_4600303.jpg?20190307143210")
			.headers(headers_3),
            http("request_53")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-mosul_4600295.jpg?20190307142937")
			.headers(headers_3),
            http("request_54")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-rohingya-myanmar_4600300.jpg?20190307143026")
			.headers(headers_3),
            http("request_55")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-mexico-drugs_4600306.jpg?20190307143526")
			.headers(headers_3),
            http("request_56")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-namibia_4600304.jpg?20190307143338")
			.headers(headers_3),
            http("request_57")
			.get(uri18 + "/resources/desktop-header-bg.jpg?bypass-service-worker&v=1")
			.headers(headers_3),
            http("request_58")
			.get(uri14 + "/19/03/384x216/skynews-hotspots-atlanta-sex-trade_4600302.jpg?20190307143109")
			.headers(headers_3),
            http("request_59")
			.get(uri14 + "/19/08/384x216/skynews-zuby-divided-trans_4756843.jpg?20190827092001")
			.headers(headers_3),
            http("request_60")
			.get(uri14 + "/18/06/384x216/skynews-mexico-ocampo-fernando-angeles_4345151.jpg?20180625074635")
			.headers(headers_3),
            http("request_61")
			.get(uri14 + "/19/05/384x216/skynews-winnie-divided_4676465.jpg?20190523115854")
			.headers(headers_3),
            http("request_62")
			.get(uri14 + "/19/05/384x216/skynews-divided-andrew-doyle_4669683.jpg?20190515153850")
			.headers(headers_3),
            http("request_63")
			.get(uri14 + "/19/05/384x216/skynews-hen-mazzig-divided_4663595.jpg?20190509150709")
			.headers(headers_3),
            http("request_64")
			.get(uri14 + "/19/04/384x216/skynews-dalia-gebrial-divided_4654599.jpg?20190430090858")
			.headers(headers_3),
            http("request_65")
			.get(uri14 + "/19/04/384x216/skynews-dave-rubin-divided_4650110.jpg?20190425154133")
			.headers(headers_3),
            http("request_66")
			.get(uri14 + "/19/04/384x216/skynews-divided-jessica-kellgren-fozard_4642428.png?20190417135015")
			.headers(headers_3),
            http("request_67")
			.get(uri14 + "/19/03/384x216/skynews-divided-yungblud-gender_4597799.jpg?20190305102457")
			.headers(headers_3),
            http("request_68")
			.get(uri14 + "/19/02/384x216/skynews-divided-girli_4569542.jpg?20190206091809")
			.headers(headers_3),
            http("request_69")
			.get(uri14 + "/19/01/384x216/skynews-divided-kimberly-woke_4562076.jpg?20190130140751")
			.headers(headers_3),
            http("request_70")
			.get(uri14 + "/19/03/384x216/skynews-caolan-divided-hard-right_4597806.jpg?20190305102901")
			.headers(headers_3),
            http("request_71")
			.get(uri14 + "/19/02/384x216/skynews-divided-courtney-drag_4577860.jpg?20190227184841")
			.headers(headers_3),
            http("request_72")
			.get(uri14 + "/19/03/384x216/skynews-divided-caolan-robertson_4600321.jpg?20190307144603")
			.headers(headers_3),
            http("request_73")
			.get(uri14 + "/19/09/384x216/skysports-greig-laidlaw-scotland_4790995.jpg?20190930120619")
			.headers(headers_3),
            http("request_74")
			.get(uri14 + "/19/09/384x216/skysports-pierre-emerick-aubameyang_4787136.jpg?20190926162448")
			.headers(headers_3),
            http("request_75")
			.get(uri14 + "/18/09/384x216/skysports-ruud-van-nistelrooy_4416938.jpg?20180910152724")
			.headers(headers_3),
            http("request_76")
			.get(uri14 + "/19/07/384x216/skynews-start-of-season-dth_4731652.jpg?20190730110158")
			.headers(headers_3),
            http("request_77")
			.get(uri18 + "/resources/fonts/sky-medium.woff")
			.headers(headers_77),
            http("request_78")
			.get(uri18 + "/resources/fonts/sky-regular.woff")
			.headers(headers_77),
            http("request_79")
			.get(uri20 + "/chartbeat.js")
			.headers(headers_3),
            http("request_80")
			.get(uri13 + "/beacon.js")
			.headers(headers_3),
            http("request_81")
			.get(uri04 + "/s-code-contents-e5b8338cdcc48434458142bd250e57674fe8e21a.js")
			.headers(headers_3),
            http("request_82")
			.get(uri11 + "/brexit-empty-background.png?bypass-service-worker&")
			.headers(headers_3),
            http("request_83")
			.get(uri11 + "/brexit-logo-transparent-background.png?bypass-service-worker")
			.headers(headers_3),
            http("request_84")
			.get(uri14 + "/19/09/768x432/skynews-boris-johnson-charlotte-edwardes_4790944.jpg?bypass-service-worker&20190930112715")
			.headers(headers_3),
            http("request_85")
			.get(uri18 + "/js/min/site-main-1421c9a84eab96f801cbeb7a5473ac6c.js")
			.headers(headers_3),
            http("request_86")
			.get(uri16 + "/get_site_data?account_id=630&href=https%3A%2F%2Fnews.sky.com%2F&requestUUID=1bdd7b9c-6149-4eb3-be8b-68cf412dd050-1569843190076&cookie=%5B%22_sp_v1_uid%3D1%3A97%3A87e54396-aa06-4ce5-a37d-b67c3e210223%3B%22%2C%22_sp_v1_csv%3D2.0.1190%3B%22%2C%22_sp_v1_lt%3D1%3Amsg%7Ctrue%3A%3B%22%2C%22_sp_v1_opt%3D1%3Alogin%7Ctrue%3Alast_id%7C11%3A%3B%22%2C%22_sp_enable_dfp_personalized_ads%3Dtrue%3B%22%2C%22_sp_v1_ss%3D1%3AH4sIAAAAAAAAAItWqo5RKimOUbKKBjLyQAyD2lidGKVUEDOvNCcHyC4BK6iurVXSgSuHSlGkLBYABFXZWH4AAAA%253D%3B%22%2C%22_sp_v1_consent%3D1!1%3A1%3A1%3A0%3B%22%2C%22_sp_v1_data%3D2%3A35321%3A1567773076%3A0%3A3%3A0%3A3%3A0%3A0%3Aa3fdd594-9000-47dd-afd5-7cb7d7f26758%3A49818%3B%22%5D")
			.headers(headers_77),
            http("request_87")
			.get(uri16 + "/get_site_data?account_id=630&href=https%3A%2F%2Fnews.sky.com%2F&requestUUID=1bdd7b9c-6149-4eb3-be8b-68cf412dd050-1569843190076&cookie=%5B%22_sp_v1_uid%3D1%3A97%3A87e54396-aa06-4ce5-a37d-b67c3e210223%3B%22%2C%22_sp_v1_csv%3D2.0.1190%3B%22%2C%22_sp_v1_lt%3D1%3Amsg%7Ctrue%3A%3B%22%2C%22_sp_v1_opt%3D1%3Alogin%7Ctrue%3Alast_id%7C11%3A%3B%22%2C%22_sp_enable_dfp_personalized_ads%3Dtrue%3B%22%2C%22_sp_v1_ss%3D1%3AH4sIAAAAAAAAAItWqo5RKimOUbKKBjLyQAyD2lidGKVUEDOvNCcHyC4BK6iurVXSgSuHSlGkLBYABFXZWH4AAAA%253D%3B%22%2C%22_sp_v1_consent%3D1!1%3A1%3A1%3A0%3B%22%2C%22_sp_v1_data%3D2%3A35321%3A1567773076%3A0%3A3%3A0%3A3%3A0%3A0%3Aa3fdd594-9000-47dd-afd5-7cb7d7f26758%3A49818%3B%22%5D")
			.headers(headers_87)
			.check(status.is(400)),
            http("request_88")
			.get(uri12 + "/loader.js?customer=sky_uk")
			.headers(headers_77),
            http("request_89")
			.get(uri13 + "/b?c1=2&c2=6035677&ns__t=1569843190806&ns_c=UTF-8&cv=3.1e&c8=The%20Latest%20News%20from%20the%20UK%20and%20Around%20the%20World%20%7C%20Sky%20News&c7=https%3A%2F%2Fnews.sky.com%2F&c9=")
			.headers(headers_3),
            http("request_90")
			.get(uri04 + "/scripts/satellite-5d4c02be64746d092d000047.js")
			.headers(headers_3),
            http("request_91")
			.get(uri10 + "?AQB=1&ndh=1&pf=1&t=30%2F8%2F2019%2013%3A33%3A10%201%20-120&D=D%3D&mid=14960004039486055483729382177451456998&aamlh=6&ce=UTF-8&pageName=skynews%3Ahome%3Ahome&g=D%3Dg&ch=skynews%3Ahome&server=news.sky.com&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&h1=home%2C%2C%2C&c2=%3A&v2=%3A&c5=gb%3Askynews%3Ahome&c9=https%3A%2F%2Fnews.sky.com%2F&c18=view%3A%3Ahome&v19=skynews%3Ahome%3Ahome&c20=home&v20=home&v24=skynews%3Ahome&c35=monday_13_33&c36=2019-09-30%2013%3A33%3A10&v40=not_logged_in&c63=Home&c74=sky%20tags-1.2.12-e3f8f8b-production&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=380&mcorgid=0ABA4673527831C00A490D45%40AdobeOrg&AQE=1")
			.headers(headers_3)
			.check(status.is(400)),
            http("request_92")
			.get(uri13 + "/r?c2=6035677&d.c=gif&d.o=bskybskynews&d.x=33873192&d.t=page&d.u=D%3Dg"),
            http("request_93")
			.get(uri24 + "/gdpr-status?siteId=2371")
			.headers(headers_87)
			.check(status.is(400)),
            http("request_94")
			.get(uri21)
			.headers(headers_3),
            http("request_95")
			.get(uri16 + "/mms/get_loaders?href=https%3A%2F%2Fnews.sky.com%2F&account_id=630&requestUUID=1bdd7b9c-6149-4eb3-be8b-68cf412dd050-1569843190076")
			.headers(headers_87)
			.check(status.is(400)),
            http("request_96")
			.get(uri25 + "/?host=news.sky.com&domain=news.sky.com&path=%2F")
			.headers(headers_87)
			.check(status.is(400)),
            http("request_97")
			.get(uri25 + "/?host=news.sky.com&domain=news.sky.com&path=%2F")
			.headers(headers_77),
            http("request_98")
			.get(uri18 + "/js/min/sdc-site-header-63ca75738fc800f5cbf18f604c4e8984.js")
			.headers(headers_3),
            http("request_99")
			.get(uri16 + "/mms/get_loaders?href=https%3A%2F%2Fnews.sky.com%2F&account_id=630&requestUUID=1bdd7b9c-6149-4eb3-be8b-68cf412dd050-1569843190076")
			.headers(headers_77),
            http("request_100")
			.get(uri18 + "/js/min/sdc-site-countdown-timer-0073a63cb70d50724b8356309d871d01.js")
			.headers(headers_3),
            http("request_101")
			.get(uri18 + "/js/min/sdc-site-load-more-279e8ab88a3af33d453830965242b79b.js")
			.headers(headers_3),
            http("request_102")
			.get(uri24 + "/gdpr-status?siteId=2371")
			.headers(headers_77),
            http("request_103")
			.get(uri18 + "/js/min/sdc-news-footer-b66ce8ebc58c6cdb366da9403cb61456.js")
			.headers(headers_3),
            http("request_104")
			.get(uri18 + "/js/min/sdc-site-consent-management-5ac4a4289ae702c6ba20b26939743fdc.js")
			.headers(headers_3),
            http("request_105")
			.get(uri03 + "?h=news.sky.com&p=%2F&u=B5BCcXBa_0ALDqtnNQ&d=news.sky.com&g=34974&g0=Home&g1=No%20Author&n=0&f=f0001&c=0&x=0&m=0&y=12806&o=1519&w=380&j=45&R=1&W=0&I=0&E=0&e=0&r=&b=1230&t=CodfDwCCPQ9gC6EJZhCbm9hxtGrjW&V=116&z=t%3DBP9ozpBKudU8BimKQiC1oWiH6w5Ju%26E%3D6%26x%3D0%26c%3D0.21%26y%3D12955%26w%3D722&i=The%20Latest%20News%20from%20the%20UK%20and%20Around%20the%20World%20%7C%20Sky%20News&tz=-120&sn=1&sv=DXucxnDfsGaC1J5BCCJeShY7h4Fe&sd=2&im=067b2ff3&_")
			.headers(headers_3),
            http("request_106")
			.options(uri08)
			.headers(headers_106),
            http("request_107")
			.get(uri15 + "/gpt/pubads_impl_2019092602.js")
			.headers(headers_3),
            http("request_108")
			.get(uri17 + "?domain=news.sky.com")
			.headers(headers_3),
            http("request_109")
			.get(uri07 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=B5BCcXBa_0ALDqtnNQ&c=0&x=Fy8DlRpJLFzG1&v=A&ml=m&sl=mZK3M&e=-1")
			.headers(headers_3),
            http("request_110")
			.post(uri08)
			.headers(headers_110)
			.body(RawFileBody("/skysimulation/0110_request.json")),
            http("request_111")
			.get(uri24 + "/2371/logic?withSiteActions=true&consentUUID=af3d7734-0a70-4f58-8122-8dc5dae63794&euconsent=BOmdy_4Omdy_4AGABBENCk-AAAAqRgmYXCiIQ4XJlBwBJAQAECuEgCDEgAAUDAAPAgARpwAiCAEgQAAgQUgAAkAAEAQIBRBAAAAQAgAAAgBBAAACAAAAEAAAAABAAAAAAAAAAAAAAAAAAAA&mmsDomain=mms.cmpsky.com&hasConsentData&consentedToAny&rejectedAny&consentedToAll&shortCircuitDetection&requestUUID=1bdd7b9c-6149-4eb3-be8b-68cf412dd050-1569843190076")
			.headers(headers_87)
			.check(status.is(400)),
            http("request_112")
			.get(uri24 + "/2371/logic?withSiteActions=true&consentUUID=af3d7734-0a70-4f58-8122-8dc5dae63794&euconsent=BOmdy_4Omdy_4AGABBENCk-AAAAqRgmYXCiIQ4XJlBwBJAQAECuEgCDEgAAUDAAPAgARpwAiCAEgQAAgQUgAAkAAEAQIBRBAAAAQAgAAAgBBAAACAAAAEAAAAABAAAAAAAAAAAAAAAAAAAA&mmsDomain=mms.cmpsky.com&hasConsentData&consentedToAny&rejectedAny&consentedToAll&shortCircuitDetection&requestUUID=1bdd7b9c-6149-4eb3-be8b-68cf412dd050-1569843190076")
			.headers(headers_77),
            http("request_113")
			.get(uri16 + "/aciR0FRQXZFQ1I9UUdSQz1IUXtUeW1iP0FBTVNMUj1HQnlyb2xiP0BOeUQ_SlFDYlBDRENQUENQeWJRQ1FRR01MPVBDRENQUENQeWJRQ1FRR01MPUtDUVE_RUM9QU1TTFJ5bGJIVHluamxqbW11bGJBQkF5VUdMQk1Vaj1RTj1qS1FFaj1HTFJDUEw_SmpBQkFtYkZQQ0R5RlJSTlFhb31hbiRhbiRMQ1VRalFJV2pBTUthbiRiQU1MUUNMUjMzJyJ5P0RvQnNzb3BpbD9zbGlwRHF0aXRtbm5pdEJBcUI_Q3Jvc3VwYlBDT1NDUVIzMycieW1AQkJzQHVBaXJtcHVpcENAb2lAQ3RAaXJ0QURwbW5CQmxxbGltcXJ1dHBvbXVsbHNyYkFNTUlHQ3lhcX5hbm49UU49VG09U0dCYW8ibWFvfXVzYW99dHNDcXBvdXJpPz9scmlwQUNxaT9vc0JpQHJzQW9Dbm1sbm5vYW9-YW5uYW4hYW5uPVFOPVRtPUFRVGFvIm5qbGptbXVsYW9-YW5uYW4hYW5uPVFOPVRtPUpSYW8ibWFvfUtRRWFzIVJQU0Nhb31hb35hbm5hbiFhbm49UU49VG09TU5SYW8ibWFvfUpNRUdMYXMhUlBTQ2FvfUo_UVI9R0JhcyFtbWFvfWFvfmFubmFuIWFubj1RTj1DTD9ASkM9QkROPU5DUFFNTD9KR1hDQj0_QlFhbyJSUFNDYW9-YW5uYW4hYW5uPVFOPVRtPVFRYW8ibWFvfSZwUSd9fX19fX19fX0nUjVPTXEwKUdLLTNAKSl-SCpXL31XIm5KR0IlKTQzIyItVCwhQSZXIXB-KXJHU1A0NjFFMVMmMUolSSp-N31-JDY4NSZwfX19fWFucW8iYW9-YW5uYW4hYW5uPVFOPVRtPUFNTFFDTFJhbyJtXW1hb31tYW99bWFvfWxhb35hbm5hbiFhbm49UU49VG09Qj9SP2FvIm5hb31vcW9ubWFvfW1xcnNzc29sc3Jhb31sYW99b2FvfWxhb31vYW99bGFvfWxhb30_b0RCQnF1cGl1bGxsaXBzQkJpP0RCcWlzQUBzQnNEbnJzcXRhb31wdXRtdGFvfmFubmFxImJKTT9CQ0IiP1I_eWFxfmFzfmFubkdCYW5uYW99YW5uIS0sMSMsMmFvfUNMQk5NR0xSYW99RlJSTlFhb31hbiRhbiRRTVNQQUNOTUdMUmpLRVBqQU1MUUNMUVNqTVBFYW99bm9zbWFubmFuIWFublBDUVNKUmFubmFvfWFubmFzfmFxIWFubkY_USFNTFFDTFIiP1I_YXEhYW5uYW99UlBTQ2FuIWFxIWFubkFNTFFDTFJDQjJNfUxXYXEhYW5uYW99UlBTQ2FuIWFxIWFublBDSENBUkNCfUxXYXEhYW5uYW99RD9KUUNhbiFhcSFhbm5BTUxRQ0xSQ0IyTX1KSmFxIWFubmFvfVJQU0NhbiFhcSFhbm5RRk1QUiFHUEFTR1IiQ1JDQVJHTUxhcSFhbm5hb31EP0pRQ2FzImFubmFzImFxIg==")
			.headers(headers_3),
            http("request_114")
			.get(uri05)
			.headers(headers_3),
            http("request_115")
			.get(uri15 + "/gpt/pubads_impl_rendering_2019092602.js")
			.headers(headers_3),
            http("request_116")
			.get(uri18 + "/resources/manifest.json")
			.headers(headers_87),
            http("request_117")
			.get(uri15 + "/gampad/ads?gdfp_req=1&pvsid=405129479794029&correlator=2895396372512764&output=ldjh&impl=fifs&adsid=ChEI8M_G7AUQyZi05P7MkfXzARI9AOuvrEMlu8On5W78i-h4KRNXmLqT9AQ_4iKLgOojMZECSY-jUcAknKWnlbh_cnHj55qvIiqjJac-8peXTw&jar=2019-9-30-10&eid=21064681%2C21064212%2C21064387%2C21064569%2C21064592&vrg=2019092602&guci=1.2.0.0.2.2.0.0&plat=1%3A32776%2C2%3A32776%2C8%3A134250504&sc=1&sfv=1-0-35&ecs=20190930&iu_parts=20346936%2Cskynews%2Cuk-homepage&enc_prev_ius=0%2F1%2F2%2C0%2F1%2F2%2C0%2F1%2F2&prev_iu_szs=728x90%7C970x250%2C300x250%7C300x600%2C3x3&prev_scp=platform%3Dlive%26advert-targeting%3D%255Bobject%2520Object%255D%7Cplatform%3Dlive%26advert-targeting%3D%255Bobject%2520Object%255D%7Cstrnativekey%3DdohLgLeB2waZW5Sk43Kx5yoE%26platform%3Dlive&eri=1&cookie_enabled=1&bc=31&abxe=1&lmt=1569843191&dt=1569843191257&dlt=1569843189824&idt=1299&frm=20&biw=1519&bih=380&oid=3&adxs=-12245933%2C-12245933%2C-12245933&adys=-12245933%2C-12245933%2C-12245933&adks=3602174142%2C1534170590%2C1970685102&ucis=1%7C2%7C3&ifi=1&u_tz=120&u_his=2&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_nplug=3&u_nmime=4&u_sd=1.25&flash=0&url=https%3A%2F%2Fnews.sky.com%2F&dssz=43&icsg=4177929077504&std=0&vis=1&dmc=8&scr_x=0&scr_y=0&psz=1519x0%7C309x401%7C309x377&msz=1519x0%7C309x0%7C309x0&ga_vid=398698159.1569843191&ga_sid=1569843191&ga_hid=192972537&fws=0%2C0%2C0&ohw=0%2C0%2C0")
			.headers(headers_87)
			.check(status.is(400)),
            http("request_118")
			.get(uri12 + "/config.js?customer=sky_uk&md5=238619-7f9af9ab")
			.headers(headers_3),
            http("request_119")
			.get(uri12 + "/loader.js?customer=sky_uk&no_conf=true&md5=1041225-c878b689")
			.headers(headers_3),
            http("request_120")
			.get(uri22 + "?md5=7219-be7b87fb")
			.headers(headers_3),
            http("request_121")
			.get(uri12 + "/svc/cdn/pub/css/widget.css?md5=10331-d72a06b6")
			.headers(headers_3),
            http("request_122")
			.post(uri19 + "?id=www_cdn_db_spark_page_view&browser=chrome&browser_ver=77&customer=sky_uk&tag_id=843&tag_date=1569249593758")
			.headers(headers_122)
			.formParam("info", """{"incognito":false,"cache_url":"http://news.sky.com/","spark_zone":"news_sky_com","customer":"sky_uk","dashboard":";type=unknown","url":"https://news.sky.com/","frame":false,"location_url":"https://news.sky.com/","page_url":"https://news.sky.com/","site":"news.sky.com","referrer":"","referrer_type":"none","is_embed":false,"is_touch":false,"support_fullscreen":true,"connection":{},"session_id":"session_id_0.8500892466802334","tag":{"id":843,"date":"2019-09-23T14:39:53.758Z"}}""")
			.formParam("filehead", "no log requested")
			.formParam("session_id", "session_id_0.8500892466802334")
			.formParam("is_json", "1")
			.formParam("ver", "1.155.375")
			.formParam("build", """platform: Win32
user_agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36
ver: 1.155.375
browser: chrome 77
browser_build: undefined
guess: {"os":"windows","version":"10.0","release_version":"10.0","arch":"64","mobile":false}""")
			.formParam("send_type", "POST")
			.check(status.is(400)),
            http("request_123")
			.post(uri09 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0123_request.txt"))
			.check(status.is(400)),
            http("request_124")
			.post(uri01 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0124_request.txt"))
			.check(status.is(400)),
            http("request_125")
			.post(uri26 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0125_request.txt"))
			.check(status.is(400)),
            http("request_126")
			.get(uri12 + "/svc/cdn/pub/inc/previews_widget.html?md5=1671-e39e7a6d")
			.headers(headers_87)
			.check(status.is(400)),
            http("request_127")
			.get(uri12 + "/svc/cdn/pub/inc/previews_widget.html?md5=1671-e39e7a6d")
			.headers(headers_77),
            http("request_128")
			.post(uri26 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0128_request.txt")),
            http("request_129")
			.post(uri06 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0129_request.txt"))
			.check(status.is(400)),
            http("request_130")
			.get(uri18 + "/lazy-images-service-worker.js")
			.headers(headers_130),
            http("request_131")
			.post(uri09 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0131_request.txt")),
            http("request_132")
			.post(uri23 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0132_request.txt"))
			.check(status.is(400)),
            http("request_133")
			.post(uri23 + "?customer=sky_uk&zone=gen&ver=1.155.375&url=https%3A%2F%2Fnews.sky.com%2F")
			.headers(headers_123)
			.body(RawFileBody("/skysimulation/0133_request.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}