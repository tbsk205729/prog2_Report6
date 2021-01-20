package jp.ac.uryukyu.ie.e205729;
import java.util.ArrayList;


public class  Data {

    /*name・・・科目名
    *unit_value・・・単位数
    */   
    private String name;
    private int unit_value;

    String getName()
    {return name;}

    int getUnit_value()
    {return unit_value;}

    Data(String name,int unit_value){
        this.name = name;
        this.unit_value = unit_value;

    }

    private ArrayList<Data> subjects = new ArrayList<>();
    public ArrayList<Data> getSubjects(){return subjects;}

    

    Data(){
        var kenkou = new Data("健康運動系科目",0);
        var zinbun = new Data("人文系科目",0);
        var shakai = new Data("社会系科目",0);
        var sizen = new Data("自然系科目",0);
        var sougou_caria_chiiki = new Data("総合・キャリア・琉大特色・地域創生",0);

        subjects.add(kenkou);
        subjects.add(zinbun);
        subjects.add(shakai);
        subjects.add(sizen);
        subjects.add(sougou_caria_chiiki);

        
        var jouhou = new Data("情報関係",0);
        var eigo = new Data("英語プレゼン・講読中級・大学英語",0);
        var gaikokugo = new Data("外国語",0);
        var gaikokugo_sougou = new Data("外国語総合",0);
        var kyouiku_sougou = new Data("教育領域総合",0);

        subjects.add(jouhou);
        subjects.add(eigo);
        subjects.add(gaikokugo);
        subjects.add(gaikokugo_sougou);
        subjects.add(kyouiku_sougou);


        var senmon_kiso = new Data("専門基礎教育",0);
        var jouhou_gijutu = new Data("情報技術系",0);
        var sougou_enshu = new Data("総合力演習",0); 
        var kenkyu_jikken = new Data("研究・実験",0); 
        var sugaku_kiso = new Data("数学基礎",0); 
        var chinou_koa = new Data("知能情報コア",0); 
        var kougaku_yugou = new Data("工学融合",0); 
        var chinou_adovanced = new Data("知能情報アドバンスト",0); 
        var chino_jouhou_kanren = new Data("知能情報関連",0); 
        var senmon_jiyu = new Data("専門科目（自由）",0); 
        var kisosu_chinou_kanren = new Data("基礎数〜知能関連　総合",0);
        var kouyu_senmon_sougou = new Data("工融〜専門（自由） 総合",0); 
        
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

    

    
    
}
