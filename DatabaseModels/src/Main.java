
public class Main {

}// genellikle kullan�c�lar kod yazmada temkinliler ama veri taban�nda ezbere
	// gidiiyorlar ve bu uzun vadede veri y�netimimin zorla�t�r�yor

//E�itim bitti�inde veri taban� tasar�m� konusunda fikir sahibi olaca��z
//bir abc bankas� olsun
// iki tip m��teri olsun ger�ek m��teri, t�zel m��teri
// ���terilerin birbirinden farkl� olraka  bilgileri mevcuttur
//m��terileirin adreslerini takip  edebilmeliyiz
//t�zel m��terinin biloan�asu olmal�
//ger�ek m��terielerin baz�lar� ticari faaliyet ger�ekle�tirmektedir
//bir ki�inini m��terii olabilmesi i�in bir�ok kanal vard�r birini se�ip devam edebilir

//�imdi k���c�k deneyimimle ba��mdan b�y�k bir i� yap�p bir model olu�turuyorum :)
// �ncelikle 2 m��teri var ve bunlar m��teri yani sahip olduklar� ortak �zellikler var dolay�s�yla ortak �zellikler ayr� bir classta(basecustomermanager) tutulur ki yeni m��teriler de gedi�inde sorun ��kmas�n buna g�re iki m��teri ve onlar� y�neten entities interface si olmasl�, m��teriler ad�na yap�lan i�ler 
// bila�o ve �b�r� i�leri oldu�u i�in bu mabimlere �zel s�n�flar a��lacak ve teme m��teri interfasinde yaz�lan g�revler ki�iye �zel implemente edilecek fakat her an yeni m��teriler de eklenebilir oldu�u i�in spagettiyi �nlemek i�in kodlar genele  yaz�lacak, herkese kullan�ma a��k. 
// m��teriler �zel ilemler bittikten sonr a m��teri olabilme ko�ullar� ortak alanda yani dataAccess de belirlenicek ve nokta (bu yaz� acemi den �te ��mez bir yaz�c� olan ben taraf�ndan yaz�lm��t�r)
//�zelliklere �zel isimler verilmelidir, 1 2  3 gibi �eyler verilmemelidir
//Engin hoca tactics 
// database i�in integrity unutulursa, ay ben elimle d�zeltirim denip bo�lan�rsa o i� patlar
// olabildi�ince SOLID in s sinden faydalan�yoruz yani kesinli�i olmasa bile kesinlikle sonra kullanacakm�� gibi her g�reve bir class atamak, yeni m��teri geldi�inde yeni �zelliklerle beraber mevcut g�evleri de kapsayabilecei�ini tahmin etmek
// o : yeni �zellik eklendi�inde mevcut hi�bir �eyi de�i�tirmemek
// s : her i�e bir s�n�f atamak
//Primary key : bir ablodaki kay�rlat� birbirinden ay�rmak i�inkulan�lan , taasar�m �eklidir yeni buradaki k�stslr tekrar yaz�lmaz, gelen ge�er buradan faydalan�r
//uniue key: bir veya birden fazla kolon uniue yazp�labilir ama� tekrarlanmas�n� engellemektir k�sacas� kolon se�ilir uniwue verilir ve ismi de�i�itirileri sonu� olarak ve bunlar t�m istenilen alanlar i�in yap�l�r s�kl�kla kar��la��an hatalar ise birden fazla primarykey kullanmakt�r ve bu �ok k�k�to bir
//durumdur( bunu yapmaya hi� gerek yoktur) zaten primary key kullan�rsan�z bir noktada insan� b�kt�r�p koodla i�i halletmye zorlar onun i�in tek primary key ile y��rnmelidir ve teminli olunmasl�d�r yoksa tertemiz ssal�al� spagetti olur openclosed: yeni bir �zellik, kolon . m��terie etc. eklendi�inde mevcut hi�bir �eyde de�i�iklik yap�lmamal�d�r yalnz� ihtiya� giderilip sistem bozulmaz,kodlar bozulmaz..b�kt�r�p.(underrated bir durumdur
// bu tasar�mlar�n t�m� normalizasyon ile yap�l�r yani muhte�em tasar�ma yaak�nla�a yoldunda at�lan sa�lam ad�mlar
// uzunvadede insanlar sizden bu sa�ma(!) i�leri b�rak�p onlar�n istedi�i tasar�mlar� kullanman� isterlerse , sak�n ��  be� kru�a normalizasyonu satma brom, elbet bu i�i has�ndan anlayan biriyle kar��las�rs�n zor ama umuD et.