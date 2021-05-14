
public class Main {

}// genellikle kullanýcýlar kod yazmada temkinliler ama veri tabanýnda ezbere
	// gidiiyorlar ve bu uzun vadede veri yönetimimin zorlaþtýrýyor

//Eðitim bittiðinde veri tabaný tasarýmý konusunda fikir sahibi olacaðýz
//bir abc bankasý olsun
// iki tip müþteri olsun gerçek müþteri, tüzel müþteri
// çüþterilerin birbirinden farklý olraka  bilgileri mevcuttur
//müþterileirin adreslerini takip  edebilmeliyiz
//tüzel müþterinin biloançasu olmalý
//gerçek müþterielerin bazýlarý ticari faaliyet gerçekleþtirmektedir
//bir kiþinini müþterii olabilmesi için birçok kanal vardýr birini seçip devam edebilir

//þimdi küçücük deneyimimle baþýmdan büyük bir iþ yapýp bir model oluþturuyorum :)
// öncelikle 2 müþteri var ve bunlar müþteri yani sahip olduklarý ortak özellikler var dolayýsýyla ortak özellikler ayrý bir classta(basecustomermanager) tutulur ki yeni müþteriler de gediðinde sorun çýkmasýn buna göre iki müþteri ve onlarý yöneten entities interface si olmaslý, müþteriler adýna yapýlan iþler 
// bilaço ve öbürü iþleri olduðu için bu mabimlere özel sýnýflar açýlacak ve teme müþteri interfasinde yazýlan görevler kiþiye özel implemente edilecek fakat her an yeni müþteriler de eklenebilir olduðu için spagettiyi önlemek için kodlar genele  yazýlacak, herkese kullanýma açýk. 
// müþteriler özel ilemler bittikten sonr a müþteri olabilme koþullarý ortak alanda yani dataAccess de belirlenicek ve nokta (bu yazý acemi den öte çömez bir yazýcý olan ben tarafýndan yazýlmýþtýr)
//özelliklere özel isimler verilmelidir, 1 2  3 gibi þeyler verilmemelidir
//Engin hoca tactics 
// database için integrity unutulursa, ay ben elimle düzeltirim denip boþlanýrsa o iþ patlar
// olabildiðince SOLID in s sinden faydalanýyoruz yani kesinliði olmasa bile kesinlikle sonra kullanacakmýþ gibi her güreve bir class atamak, yeni müþteri geldiðinde yeni özelliklerle beraber mevcut göevleri de kapsayabileceiðini tahmin etmek
// o : yeni özellik eklendiðinde mevcut hiçbir þeyi deðiþtirmemek
// s : her iþe bir sýnýf atamak
//Primary key : bir ablodaki kayýrlatý birbirinden ayýrmak içinkulanýlan , taasarým þeklidir yeni buradaki kýstslr tekrar yazýlmaz, gelen geçer buradan faydalanýr
//uniue key: bir veya birden fazla kolon uniue yazpýlabilir amaç tekrarlanmasýný engellemektir kýsacasý kolon seçilir uniwue verilir ve ismi deðiþitirileri sonuç olarak ve bunlar tüm istenilen alanlar için yapýlýr sýklýkla karþýlaþýan hatalar ise birden fazla primarykey kullanmaktýr ve bu çok köküto bir
//durumdur( bunu yapmaya hiç gerek yoktur) zaten primary key kullanýrsanýz bir noktada insaný býktýrýp koodla iþi halletmye zorlar onun için tek primary key ile yüürnmelidir ve teminli olunmaslýdýr yoksa tertemiz ssalçalý spagetti olur openclosed: yeni bir özellik, kolon . müþterie etc. eklendiðinde mevcut hiçbir þeyde deðiþiklik yapýlmamalýdýr yalnzý ihtiyaç giderilip sistem bozulmaz,kodlar bozulmaz..býktýrýp.(underrated bir durumdur
// bu tasarýmlarýn tümü normalizasyon ile yapýlýr yani muhteþem tasarýma yaakýnlaþa yoldunda atýlan saðlam adýmlar
// uzunvadede insanlar sizden bu saçma(!) iþleri býrakýp onlarýn istediði tasarýmlarý kullanmaný isterlerse , sakýn üç  beþ kruþa normalizasyonu satma brom, elbet bu iþi hasýndan anlayan biriyle karþýlasýrsýn zor ama umuD et.