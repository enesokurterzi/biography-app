package com.example.BiographyApp.services

import com.example.BiographyApp.models.About

class AboutService {
    fun aboutContentResult(): About {
        val about = About("Merhaba, Ben 13 Nisan 1998 tarihinde Sakarya'da doğdum.\n" +
                "\nLise eğitimim bitene kadar Sakarya'da yaşadım ardından üniversite eğitimim için Isparta'ya geçtim.\n" +
                "\nSüleyman Demirel Üniversite'sinde bilgisayar mühendisliği bölümünü okudum. Okuduğum süre içerisinde üniversitemizin ingilizce eğitimini yetersiz bulduğum için özel bir kursta yaklaşık iki yıl ingilizce eğitimi gördüm. Onlarca kitap okudum ve çevre illeri dolaştım. Bu yüzden de hobilerim arasında gezmek ve kitap okumak var diyebilirim. Yine üniversite eğitimim içerisinde vücut geliştirme ile ilgilendim ve şuan da ilgilenmeye devam ediyorum. Bundan dolayı da hobilerim arasına vücut geliştirmeyi de dahil edebilirim. Üçüncü senemin ilk döneminde kazanmış olduğum Erasmus sınavı ile birlikte Polonya'ya gittim ve orada da çok başarılı bir dönem geçirdim.\n" +
                "\nPolonya'da eğitim aldığım süre içerisinde 4 ülke ve 10 şehir gezdim. Çok farklı yaşam tarzları gördüm ve iyisiyle kötüsüyle eğitimimin bu bölümünü de kendimi geliştirerek tamamladım.\n" +
                "\nÜniversite eğitimimin ardından geri döndüğüm memleketimden askerliğim için Malatya'ya gittim ve orada 1 sene askerlik görevimi yaptım.\n" +
                "\nŞu anda mesleğim olan bilgisayar mühendisliği üzerine çalışmalarıma devam etmekteyim."
        )
        return about
    }
}