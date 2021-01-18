package jp.ac.uryukyu.ie.e205729;
import java.util.ArrayList;


public class  Data {

    ArrayList<Subjects> subjects = new ArrayList<>();

    Data(){
        var kenkou = new Subjects("健康運動系科目",0);
        var zinbun = new Subjects("人文系科目",0);
        var shakai = new Subjects("社会系科目",0);
        var sizen = new Subjects("自然系科目",0);
        var sougou_caria_chiiki = new Subjects("総合・キャリア・琉大特色・地域創生",0);

        subjects.add(kenkou);
        subjects.add(zinbun);
        subjects.add(shakai);
        subjects.add(sizen);
        subjects.add(sougou_caria_chiiki);

        
        var jouhou = new Subjects("情報関係",0);
        var eigo = new Subjects("英語プレゼン・講読中級・大学英語",0);
        var gaikokugo = new Subjects("外国語",0);
        var gaikokugo_sougou = new Subjects("外国語総合",0);
        var kyouiku_sougou = new Subjects("教育領域総合",0);

        subjects.add(jouhou);
        subjects.add(eigo);
        subjects.add(gaikokugo);
        subjects.add(gaikokugo_sougou);
        subjects.add(kyouiku_sougou);


        var senmon_kiso = new Subjects("専門基礎教育",0);
        var jouhou_gijutu = new Subjects("情報技術系",0);
        var sougou_enshu = new Subjects("総合力演習",0); 
        var kenkyu_jikken = new Subjects("研究・実験",0); 
        var sugaku_kiso = new Subjects("数学基礎",0); 
        var chinou_koa = new Subjects("知能情報コア",0); 
        var kougaku_yugou = new Subjects("工学融合",0); 
        var chinou_adovanced = new Subjects("知能情報アドバンスト",0); 
        var chino_jouhou_kanren = new Subjects("知能情報関連",0); 
        var senmon_jiyu = new Subjects("専門科目（自由）",0); 
        var kisosu_chinou_kanren = new Subjects("基礎数〜知能関連　総合",0);
        var kouyu_senmon_sougou = new Subjects("工融〜専門（自由） 総合",0); 
        
        subjects.add(senmon_kiso);
        subjects.add(jouhou_gijutu);
        subjects.add(sougou_enshu);
        subjects.add(kenkyu_jikken);
        subjects.add(sugaku_kiso);
        subjects.add(chinou_koa);
        subjects.add(kougaku_yugou);
        subjects.add(chinou_adovanced);
        subjects.add(chino_jouhou_kanren);
        subjects.add(senmon_jiyu);
        subjects.add(kisosu_chinou_kanren);
        subjects.add(kouyu_senmon_sougou);
        
    }

    public void PrintTest() { 
        for(var sb : subjects) {
            sb.PrintTest();
        }
    }
    
}
