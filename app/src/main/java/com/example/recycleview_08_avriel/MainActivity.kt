package com.example.recycleview_08_avriel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val  INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val makananList = listOf<Makanan>(
            Makanan(
                R.drawable.buntil_pwt,
                nameMakanan = "Buntil",
                descMakanan = "Buntil biasa dijajakan di pasar tradisional Purwokerto, mungkin rasanya akan terasa aneh kalau baru mencicipinya, namun Buntil sangat enak dijadikan lauk bersama nasi.Buntil terbuat dari parutan kelapa muda yang diberi bumbu semacam kluban dan dibentuk bulat lalau dibungkus pula dengan daun singkong, daun pepaya atau daun talas kemudian diikat atau diuntil-until menggunakan tali bambu."
            ),
            Makanan(
                R.drawable.cenil_pwt,
                nameMakanan = "Cenil",
                descMakanan = "Cenil termasuk salah satu jajanan tradisional khas Banyumas dan Purwokerto yang bertekstur kenyal.Cenil memiliki warna yang mencolok dan bervariasi seperti merah dan hijau. Cenil terbuat dari singkong, tepung kanji, daun pandan, dan taburan kelapa parut.Cenil biasa disajikan menggunakan alas daun pisang dengan diatasnya disiram gula aren cair, rasanya manis dan lezat."
            ),
            Makanan(
                R.drawable.combro_pwt,
                nameMakanan = "Combro",
                descMakanan = "Combro khas Purwokerto berbentuk lonjong dan terbuat dari bahan baku singkong yang diparut dan diperas untuk menghilangkan kadar airnya, kemudian dibentuk lonjong dan digoreng.Untuk isi combro biasanya digunakan sambal oncom yang gurih dan juga pedas.Combro memiliki tekstur yang renyah dan sangat cocok dimakan sewaktu masih hangat."
            ),
            Makanan(
                R.drawable.gethuk_grg,
                nameMakanan = "Gethuk",
                descMakanan = "Cemilan khas Purwokerto ini memiliki rasa yang legit, dan bernama Gethuk Goreng.Sesuai dengan namanya, Gethuk Goreng terbuat dari Gethuk yaitu olahan singkong yang diberi bumbu gula kelapa, kemudian selanjutnya digoreng.Gethuk Goreng memiliki varian rasa seperti, original atau dengan gula aren, cokelat, dan bahkan rasa durian."
            ),
            Makanan(
                R.drawable.mendoan_pwt,
                nameMakanan = "Mendoan",
                descMakanan = "Mendoan Purwokerto biasanya akan disajikan dalam keadaan lembek atau ada juga yang disajikan berkulit crispy namun Mendoannya tetap tidak kering yang biasa dikenal dengan nama Mendoan Kriuk, selain itu irisan tempenya khas yaitu tipis.Ketika dimakan Mendoan Purwokerto akan terasa begitu gurih dan lezat, apalagi disantap bersama cabai rawit atau cocolan sambal kecap."
            ),
            Makanan(
                R.drawable.keripik_tempe,
                nameMakanan = "Keripik tempe",
                descMakanan = "Keripik Tempe atau yang familiar disebut keripik tempe oleh masyarakat Banyumas dan Purwokerto.Makanan khas Purwokerto yang satu ini berbahan dasar kedelai yang telah diolah menjadi tempe.Tempe pada Keripik Tempe dibuat dengan cara mengirisnya tipis lalu dicampur bumbu khusus dan digoreng kering, dengan ketepatan yang pas."
            ),
            Makanan(
                R.drawable.kraca_pwt,
                nameMakanan = "Kraca",
                descMakanan = "Kraca cukup laris terutama di bulan Ramadhan sebagai menu buka puasa, namun Kraca juga bisa ditemukan setiap hari di Purwokerto.Kraca terbuat dari hewan berjenis siput air yang direbus selama 4-5 jam dan kemudian dimasak menggunakan rempah-rempah.Rasanya gurih dan nikmat. Kraca memiliki citarasa yang gurih dan lezat dengan teksturnya yang lunak."
            ),
            Makanan(
                R.drawable.soto_skj,
                nameMakanan = "Soto Sokaraja",
                descMakanan = "Soto Sokaraja atau masyarakat Purwokerto dan Banyumas menyebutnya Sroto Sokaraja adalah salah satu kuliner yang khas.Salah satu ciri yang membedakan dari soto yang lain adalah penggunaan ketupat dan sambal kacang yang tidak pedas.Selain itu teman pendamping Soto Sokaraja juga khas yaitu Kerupuk Cantir berbahan dasar ketela pohon.Soto Sokaraja menggunakan daging ayam atau sapi dengan kuah kaldu sesuai dengan dagingnya, rasanya gurih, lezat, dan segar."
            ),
            Makanan(
                R.drawable.mino,
                nameMakanan = "Mino",
                descMakanan = "Mino adalah Nopia yang berbentuk mini, yaitu sejenis kue kering yang terbuat dari tepung terigu dan didalamnya berisi adonan gula jawa.Bentuknya agak lonjong, Mino dibuat dengan mengoven atau memanggang selama 15 menit.Tekstur luarnya keras namun sewaktu digigit rasa manis dari gula jawanya begitu terasa."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MakananAdapter(this, makananList){
            val intent = Intent(this,DetailMakananActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}