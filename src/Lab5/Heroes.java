package Lab5;


import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Heroes implements Serializable {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("localized_name")
    private String localizedName;
    @JsonProperty("primary_attr")
    private String primaryAttr;
    @JsonProperty("attack_type")
    private String attackType;
    @JsonProperty("roles")
    private List<String> roles = null;
    @JsonProperty("img")
    private String img;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("base_health")
    private int baseHealth;
    @JsonProperty("base_health_regen")
    private double baseHealthRegen;
    @JsonProperty("base_mana")
    private int baseMana;
    @JsonProperty("base_mana_regen")
    private int baseManaRegen;
    @JsonProperty("base_armor")
    private int baseArmor;
    @JsonProperty("base_mr")
    private int baseMr;
    @JsonProperty("base_attack_min")
    private int baseAttackMin;
    @JsonProperty("base_attack_max")
    private int baseAttackMax;
    @JsonProperty("base_str")
    private int baseStr;
    @JsonProperty("base_agi")
    private int baseAgi;
    @JsonProperty("base_int")
    private int baseInt;
    @JsonProperty("str_gain")
    private double strGain;
    @JsonProperty("agi_gain")
    private int agiGain;
    @JsonProperty("int_gain")
    private double intGain;
    @JsonProperty("attack_range")
    private int attackRange;
    @JsonProperty("projectile_speed")
    private int projectileSpeed;
    @JsonProperty("attack_rate")
    private double attackRate;
    @JsonProperty("move_speed")
    private int moveSpeed;
    @JsonProperty("turn_rate")
    private double turnRate;
    @JsonProperty("cm_enabled")
    private boolean cmEnabled;
    @JsonProperty("legs")
    private int legs;
    @JsonProperty("pro_win")
    private int proWin;
    @JsonProperty("pro_pick")
    private int proPick;
    @JsonProperty("hero_id")
    private int heroId;
    @JsonProperty("pro_ban")
    private int proBan;
    @JsonProperty("1_pick")
    private int _1Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Рекрут"
    @JsonProperty("1_win")
    private int _1Win;    //кол-во побед, когда персонаж был взят игроком ранга "Рекрут"
    @JsonProperty("2_pick")
    private int _2Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Страж"
    @JsonProperty("2_win")
    private int _2Win;
    @JsonProperty("3_pick")
    private int _3Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Рыцарь"
    @JsonProperty("3_win")
    private int _3Win;
    @JsonProperty("4_pick")
    private int _4Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Герой"
    @JsonProperty("4_win")
    private int _4Win;
    @JsonProperty("5_pick")
    private int _5Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Легенда"
    @JsonProperty("5_win")
    private int _5Win;
    @JsonProperty("6_pick")
    private int _6Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Властелин"
    @JsonProperty("6_win")
    private int _6Win;
    @JsonProperty("7_pick")
    private int _7Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Божество"
    @JsonProperty("7_win")
    private int _7Win;
    @JsonProperty("8_pick")
    private int _8Pick;   //кол-во раз, когда персонаж был взят игроком с рангом "Титан"
    @JsonProperty("8_win")
    private int _8Win;
    @JsonProperty("null_pick")
    private int nullPick;
    @JsonProperty("null_win")
    private int nullWin;

    public Heroes(int id, String name, String localizedName, String primaryAttr, String attackType, List<String> roles, String img, String icon, int baseHealth, double baseHealthRegen, int baseMana, int baseManaRegen, int baseArmor, int baseMr, int baseAttackMin, int baseAttackMax, int baseStr, int baseAgi, int baseInt, double strGain, int agiGain, double intGain, int attackRange, int projectileSpeed, double attackRate, int moveSpeed, double turnRate, boolean cmEnabled, int legs, int proWin, int proPick, int heroId, int proBan, int _1Pick, int _1Win, int _2Pick, int _2Win, int _3Pick, int _3Win, int _4Pick, int _4Win, int _5Pick, int _5Win, int _6Pick, int _6Win, int _7Pick, int _7Win, int _8Pick, int _8Win, int nullPick, int nullWin) {
        super();
        this.id = id;
        this.name = name;
        this.localizedName = localizedName;
        this.primaryAttr = primaryAttr;
        this.attackType = attackType;
        this.roles = roles;
        this.img = img;
        this.icon = icon;
        this.baseHealth = baseHealth;
        this.baseHealthRegen = baseHealthRegen;
        this.baseMana = baseMana;
        this.baseManaRegen = baseManaRegen;
        this.baseArmor = baseArmor;
        this.baseMr = baseMr;
        this.baseAttackMin = baseAttackMin;
        this.baseAttackMax = baseAttackMax;
        this.baseStr = baseStr;
        this.baseAgi = baseAgi;
        this.baseInt = baseInt;
        this.strGain = strGain;
        this.agiGain = agiGain;
        this.intGain = intGain;
        this.attackRange = attackRange;
        this.projectileSpeed = projectileSpeed;
        this.attackRate = attackRate;
        this.moveSpeed = moveSpeed;
        this.turnRate = turnRate;
        this.cmEnabled = cmEnabled;
        this.legs = legs;
        this.proWin = proWin;
        this.proPick = proPick;
        this.heroId = heroId;
        this.proBan = proBan;
        this._1Pick = _1Pick;
        this._1Win = _1Win;
        this._2Pick = _2Pick;
        this._2Win = _2Win;
        this._3Pick = _3Pick;
        this._3Win = _3Win;
        this._4Pick = _4Pick;
        this._4Win = _4Win;
        this._5Pick = _5Pick;
        this._5Win = _5Win;
        this._6Pick = _6Pick;
        this._6Win = _6Win;
        this._7Pick = _7Pick;
        this._7Win = _7Win;
        this._8Pick = _8Pick;
        this._8Win = _8Win;
        this.nullPick = nullPick;
        this.nullWin = nullWin;
    }

    public Heroes() {
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("localized_name")
    public String getLocalizedName() {
        return localizedName;
    }

    @JsonProperty("localized_name")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    @JsonProperty("primary_attr")
    public String getPrimaryAttr() {
        return primaryAttr;
    }

    @JsonProperty("primary_attr")
    public void setPrimaryAttr(String primaryAttr) {
        this.primaryAttr = primaryAttr;
    }

    @JsonProperty("attack_type")
    public String getAttackType() {
        return attackType;
    }

    @JsonProperty("attack_type")
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @JsonProperty("img")
    public String getImg() {
        return img;
    }

    @JsonProperty("img")
    public void setImg(String img) {
        this.img = img;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("base_health")
    public int getBaseHealth() {
        return baseHealth;
    }

    @JsonProperty("base_health")
    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    @JsonProperty("base_health_regen")
    public double getBaseHealthRegen() {
        return baseHealthRegen;
    }

    @JsonProperty("base_health_regen")
    public void setBaseHealthRegen(double baseHealthRegen) {
        this.baseHealthRegen = baseHealthRegen;
    }

    @JsonProperty("base_mana")
    public int getBaseMana() {
        return baseMana;
    }

    @JsonProperty("base_mana")
    public void setBaseMana(int baseMana) {
        this.baseMana = baseMana;
    }

    @JsonProperty("base_mana_regen")
    public int getBaseManaRegen() {
        return baseManaRegen;
    }

    @JsonProperty("base_mana_regen")
    public void setBaseManaRegen(int baseManaRegen) {
        this.baseManaRegen = baseManaRegen;
    }

    @JsonProperty("base_armor")
    public int getBaseArmor() {
        return baseArmor;
    }

    @JsonProperty("base_armor")
    public void setBaseArmor(int baseArmor) {
        this.baseArmor = baseArmor;
    }

    @JsonProperty("base_mr")
    public int getBaseMr() {
        return baseMr;
    }

    @JsonProperty("base_mr")
    public void setBaseMr(int baseMr) {
        this.baseMr = baseMr;
    }

    @JsonProperty("base_attack_min")
    public int getBaseAttackMin() {
        return baseAttackMin;
    }

    @JsonProperty("base_attack_min")
    public void setBaseAttackMin(int baseAttackMin) {
        this.baseAttackMin = baseAttackMin;
    }

    @JsonProperty("base_attack_max")
    public int getBaseAttackMax() {
        return baseAttackMax;
    }

    @JsonProperty("base_attack_max")
    public void setBaseAttackMax(int baseAttackMax) {
        this.baseAttackMax = baseAttackMax;
    }

    @JsonProperty("base_str")
    public int getBaseStr() {
        return baseStr;
    }

    @JsonProperty("base_str")
    public void setBaseStr(int baseStr) {
        this.baseStr = baseStr;
    }

    @JsonProperty("base_agi")
    public int getBaseAgi() {
        return baseAgi;
    }

    @JsonProperty("base_agi")
    public void setBaseAgi(int baseAgi) {
        this.baseAgi = baseAgi;
    }

    @JsonProperty("base_int")
    public int getBaseInt() {
        return baseInt;
    }

    @JsonProperty("base_int")
    public void setBaseInt(int baseInt) {
        this.baseInt = baseInt;
    }

    @JsonProperty("str_gain")
    public double getStrGain() {
        return strGain;
    }

    @JsonProperty("str_gain")
    public void setStrGain(double strGain) {
        this.strGain = strGain;
    }

    @JsonProperty("agi_gain")
    public int getAgiGain() {
        return agiGain;
    }

    @JsonProperty("agi_gain")
    public void setAgiGain(int agiGain) {
        this.agiGain = agiGain;
    }

    @JsonProperty("int_gain")
    public double getIntGain() {
        return intGain;
    }

    @JsonProperty("int_gain")
    public void setIntGain(double intGain) {
        this.intGain = intGain;
    }

    @JsonProperty("attack_range")
    public int getAttackRange() {
        return attackRange;
    }

    @JsonProperty("attack_range")
    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    @JsonProperty("projectile_speed")
    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    @JsonProperty("projectile_speed")
    public void setProjectileSpeed(int projectileSpeed) {
        this.projectileSpeed = projectileSpeed;
    }

    @JsonProperty("attack_rate")
    public double getAttackRate() {
        return attackRate;
    }

    @JsonProperty("attack_rate")
    public void setAttackRate(double attackRate) {
        this.attackRate = attackRate;
    }

    @JsonProperty("move_speed")
    public int getMoveSpeed() {
        return moveSpeed;
    }

    @JsonProperty("move_speed")
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    @JsonProperty("turn_rate")
    public double getTurnRate() {
        return turnRate;
    }

    @JsonProperty("turn_rate")
    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    @JsonProperty("cm_enabled")
    public boolean isCmEnabled() {
        return cmEnabled;
    }

    @JsonProperty("cm_enabled")
    public void setCmEnabled(boolean cmEnabled) {
        this.cmEnabled = cmEnabled;
    }

    @JsonProperty("legs")
    public int getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(int legs) {
        this.legs = legs;
    }

    @JsonProperty("pro_win")
    public int getProWin() {
        return proWin;
    }

    @JsonProperty("pro_win")
    public void setProWin(int proWin) {
        this.proWin = proWin;
    }

    @JsonProperty("pro_pick")
    public int getProPick() {
        return proPick;
    }

    @JsonProperty("pro_pick")
    public void setProPick(int proPick) {
        this.proPick = proPick;
    }

    @JsonProperty("hero_id")
    public int getHeroId() {
        return heroId;
    }

    @JsonProperty("hero_id")
    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    @JsonProperty("pro_ban")
    public int getProBan() {
        return proBan;
    }

    @JsonProperty("pro_ban")
    public void setProBan(int proBan) {
        this.proBan = proBan;
    }

    @JsonProperty("1_pick")
    public int get1Pick() {
        return _1Pick;
    }

    @JsonProperty("1_pick")
    public void set1Pick(int _1Pick) {
        this._1Pick = _1Pick;
    }

    @JsonProperty("1_win")
    public int get1Win() {
        return _1Win;
    }

    @JsonProperty("1_win")
    public void set1Win(int _1Win) {
        this._1Win = _1Win;
    }

    @JsonProperty("2_pick")
    public int get2Pick() {
        return _2Pick;
    }

    @JsonProperty("2_pick")
    public void set2Pick(int _2Pick) {
        this._2Pick = _2Pick;
    }

    @JsonProperty("2_win")
    public int get2Win() {
        return _2Win;
    }

    @JsonProperty("2_win")
    public void set2Win(int _2Win) {
        this._2Win = _2Win;
    }

    @JsonProperty("3_pick")
    public int get3Pick() {
        return _3Pick;
    }

    @JsonProperty("3_pick")
    public void set3Pick(int _3Pick) {
        this._3Pick = _3Pick;
    }

    @JsonProperty("3_win")
    public int get3Win() {
        return _3Win;
    }

    @JsonProperty("3_win")
    public void set3Win(int _3Win) {
        this._3Win = _3Win;
    }

    @JsonProperty("4_pick")
    public int get4Pick() {
        return _4Pick;
    }

    @JsonProperty("4_pick")
    public void set4Pick(int _4Pick) {
        this._4Pick = _4Pick;
    }

    @JsonProperty("4_win")
    public int get4Win() {
        return _4Win;
    }

    @JsonProperty("4_win")
    public void set4Win(int _4Win) {
        this._4Win = _4Win;
    }

    @JsonProperty("5_pick")
    public int get5Pick() {
        return _5Pick;
    }

    @JsonProperty("5_pick")
    public void set5Pick(int _5Pick) {
        this._5Pick = _5Pick;
    }

    @JsonProperty("5_win")
    public int get5Win() {
        return _5Win;
    }

    @JsonProperty("5_win")
    public void set5Win(int _5Win) {
        this._5Win = _5Win;
    }

    @JsonProperty("6_pick")
    public int get6Pick() {
        return _6Pick;
    }

    @JsonProperty("6_pick")
    public void set6Pick(int _6Pick) {
        this._6Pick = _6Pick;
    }

    @JsonProperty("6_win")
    public int get6Win() {
        return _6Win;
    }

    @JsonProperty("6_win")
    public void set6Win(int _6Win) {
        this._6Win = _6Win;
    }

    @JsonProperty("7_pick")
    public int get7Pick() {
        return _7Pick;
    }

    @JsonProperty("7_pick")
    public void set7Pick(int _7Pick) {
        this._7Pick = _7Pick;
    }

    @JsonProperty("7_win")
    public int get7Win() {
        return _7Win;
    }

    @JsonProperty("7_win")
    public void set7Win(int _7Win) {
        this._7Win = _7Win;
    }

    @JsonProperty("8_pick")
    public int get8Pick() {
        return _8Pick;
    }

    @JsonProperty("8_pick")
    public void set8Pick(int _8Pick) {
        this._8Pick = _8Pick;
    }

    @JsonProperty("8_win")
    public int get8Win() {
        return _8Win;
    }

    @JsonProperty("8_win")
    public void set8Win(int _8Win) {
        this._8Win = _8Win;
    }

    @JsonProperty("null_pick")
    public int getNullPick() {
        return nullPick;
    }

    @JsonProperty("null_pick")
    public void setNullPick(int nullPick) {
        this.nullPick = nullPick;
    }

    @JsonProperty("null_win")
    public int getNullWin() {
        return nullWin;
    }

    @JsonProperty("null_win")
    public void setNullWin(int nullWin) {
        this.nullWin = nullWin;
    }

    @Override
    public String toString() {
        return "Heroes1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localizedName='" + localizedName + '\'' +
                ", primaryAttr='" + primaryAttr + '\'' +
                ", attackType='" + attackType + '\'' +
                ", roles=" + roles +
                ", img='" + img + '\'' +
                ", icon='" + icon + '\'' +
                ", baseHealth=" + baseHealth +
                ", baseHealthRegen=" + baseHealthRegen +
                ", baseMana=" + baseMana +
                ", baseManaRegen=" + baseManaRegen +
                ", baseArmor=" + baseArmor +
                ", baseMr=" + baseMr +
                ", baseAttackMin=" + baseAttackMin +
                ", baseAttackMax=" + baseAttackMax +
                ", baseStr=" + baseStr +
                ", baseAgi=" + baseAgi +
                ", baseInt=" + baseInt +
                ", strGain=" + strGain +
                ", agiGain=" + agiGain +
                ", intGain=" + intGain +
                ", attackRange=" + attackRange +
                ", projectileSpeed=" + projectileSpeed +
                ", attackRate=" + attackRate +
                ", moveSpeed=" + moveSpeed +
                ", turnRate=" + turnRate +
                ", cmEnabled=" + cmEnabled +
                ", legs=" + legs +
                ", proWin=" + proWin +
                ", proPick=" + proPick +
                ", heroId=" + heroId +
                ", proBan=" + proBan +
                ", _1Pick=" + _1Pick +
                ", _1Win=" + _1Win +
                ", _2Pick=" + _2Pick +
                ", _2Win=" + _2Win +
                ", _3Pick=" + _3Pick +
                ", _3Win=" + _3Win +
                ", _4Pick=" + _4Pick +
                ", _4Win=" + _4Win +
                ", _5Pick=" + _5Pick +
                ", _5Win=" + _5Win +
                ", _6Pick=" + _6Pick +
                ", _6Win=" + _6Win +
                ", _7Pick=" + _7Pick +
                ", _7Win=" + _7Win +
                ", _8Pick=" + _8Pick +
                ", _8Win=" + _8Win +
                ", nullPick=" + nullPick +
                ", nullWin=" + nullWin +
                '}' + "\n";
    }

    public static Comparator<Heroes> byBaseArmorDesc = (o1, o2) -> Integer.compare(o1.baseArmor, o2.baseArmor);
    public static Comparator<Heroes> byBaseArmorAsc = (o1, o2) -> Integer.compare(o2.baseArmor, o1.baseArmor);
    public static Comparator<Heroes> byBaseAttackMinDesc = (o1, o2) -> Integer.compare(o1.baseAttackMin, o2.baseAttackMin);
    public static Comparator<Heroes> byBaseAttackMinAsc = (o1, o2) -> Integer.compare(o2.baseAttackMin, o1.baseAttackMin);
    public static Comparator<Heroes> byBaseAttackMaxDesc = (o1, o2) -> Integer.compare(o1.baseAttackMax, o2.baseAttackMax);
    public static Comparator<Heroes> byBaseAttackMaxAsc = (o1, o2) -> Integer.compare(o2.baseAttackMax, o1.baseAttackMax);
    public static Comparator<Heroes> byBaseStrDesc = (o1, o2) -> Integer.compare(o1.baseStr, o2.baseStr);
    public static Comparator<Heroes> byBaseStrAsc = (o1, o2) -> Integer.compare(o2.baseStr, o1.baseStr);
    public static Comparator<Heroes> byBaseAgiDesc = (o1, o2) -> Integer.compare(o1.baseAgi, o2.baseAgi);
    public static Comparator<Heroes> byBaseAgiAsc = (o1, o2) -> Integer.compare(o2.baseAgi, o1.baseAgi);
    public static Comparator<Heroes> byBaseIntDesc = (o1, o2) -> Integer.compare(o1.baseInt, o2.baseInt);
    public static Comparator<Heroes> byBaseIntAsc = (o1, o2) -> Integer.compare(o2.baseInt, o1.baseInt);
    public static Comparator<Heroes> byStrGainDesc = (o1, o2) -> Double.compare(o1.strGain, o2.strGain);
    public static Comparator<Heroes> byStrGainAsc = (o1, o2) -> Double.compare(o2.strGain, o1.strGain);
    public static Comparator<Heroes> byAgiGainDesc = (o1, o2) -> Double.compare(o1.agiGain, o2.agiGain);
    public static Comparator<Heroes> byAgiGainAsc = (o1, o2) -> Double.compare(o2.agiGain, o1.agiGain);
    public static Comparator<Heroes> byIntGainDesc = (o1, o2) -> Double.compare(o1.intGain, o2.intGain);
    public static Comparator<Heroes> byIntGainAsc = (o1, o2) -> Double.compare(o2.intGain, o1.intGain);
    public static Comparator<Heroes> byAttackRangDesc = (o1, o2) -> Integer.compare(o1.attackRange, o2.attackRange);
    public static Comparator<Heroes> byAttackRangAsc = (o1, o2) -> Integer.compare(o2.attackRange, o1.attackRange);
    public static Comparator<Heroes> byProjectileSpeedDesc = (o1, o2) -> Integer.compare(o1.projectileSpeed, o2.projectileSpeed);
    public static Comparator<Heroes> byProjectileSpeedAsc = (o1, o2) -> Integer.compare(o2.projectileSpeed, o1.projectileSpeed);
    public static Comparator<Heroes> byAttackRateDesc = (o1, o2) -> Double.compare(o1.attackRate, o2.attackRate);
    public static Comparator<Heroes> byAttackRateAsc = (o1, o2) -> Double.compare(o2.attackRate, o1.attackRate);
    public static Comparator<Heroes> byBaseHealthRegenDesc = (o1, o2) -> Double.compare(o1.baseHealthRegen, o2.baseHealthRegen);
    public static Comparator<Heroes> byBaseHealthRegenAsc = (o1, o2) -> Double.compare(o2.baseHealthRegen, o1.baseHealthRegen);
    public static Comparator<Heroes> byBaseManaRegenDesc = (o1, o2) -> Double.compare(o1.baseManaRegen, o2.baseManaRegen);
    public static Comparator<Heroes> byBaseManaRegenAsc = (o1, o2) -> Double.compare(o2.baseManaRegen, o1.baseManaRegen);
    public static Comparator<Heroes> byMoveSpeedDesc = (o1, o2) -> Integer.compare(o1.moveSpeed, o2.moveSpeed);
    public static Comparator<Heroes> byMoveSpeedAsc = (o1, o2) -> Integer.compare(o2.moveSpeed, o1.moveSpeed);
    public static Comparator<Heroes> byTurnRateDesc = (o1, o2) -> Integer.compare(o1.moveSpeed, o2.moveSpeed);
    public static Comparator<Heroes> byTurnRateAsc = (o1, o2) -> Integer.compare(o2.moveSpeed, o1.moveSpeed);
    public static Comparator<Heroes> byLegsNumberDesc = (o1, o2) -> Integer.compare(o1.moveSpeed, o2.moveSpeed);
    public static Comparator<Heroes> byLegsNumberAsc = (o1, o2) -> Integer.compare(o2.moveSpeed, o1.moveSpeed);
    public static Comparator<Heroes> byProWinDesc = (o1, o2) -> Integer.compare(o1.proWin, o2.proWin);
    public static Comparator<Heroes> byProWinAsc = (o1, o2) -> Integer.compare(o2.proWin, o1.proWin);
    public static Comparator<Heroes> byProPickDesc = (o1, o2) -> Integer.compare(o1.proPick, o2.proPick);
    public static Comparator<Heroes> byProPickAsc = (o1, o2) -> Integer.compare(o2.proPick, o1.proPick);
    public static Comparator<Heroes> byProBanDesc = (o1, o2) -> Integer.compare(o1.proBan, o2.proBan);
    public static Comparator<Heroes> byProBanAsc = (o1, o2) -> Integer.compare(o2.proBan, o1.proBan);
    public static Comparator<Heroes> by_1PickDesc = (o1, o2) -> Integer.compare(o1._1Pick, o2._1Pick);
    public static Comparator<Heroes> by_1PickAsc = (o1, o2) -> Integer.compare(o2._1Pick, o1._1Pick);
    public static Comparator<Heroes> by_1WinDesc = (o1, o2) -> Integer.compare(o1._1Win, o2._1Win);
    public static Comparator<Heroes> by_1WinAsc = (o1, o2) -> Integer.compare(o2._1Win, o1._1Win);
    public static Comparator<Heroes> by_2PickDesc = (o1, o2) -> Integer.compare(o1._2Pick, o2._2Pick);
    public static Comparator<Heroes> by_2PickAsc = (o1, o2) -> Integer.compare(o2._2Pick, o1._2Pick);
    public static Comparator<Heroes> by_2WinDesc = (o1, o2) -> Integer.compare(o1._2Win, o2._2Win);
    public static Comparator<Heroes> by_2WinAsc = (o1, o2) -> Integer.compare(o2._2Win, o1._2Win);
    public static Comparator<Heroes> by_3PickDesc = (o1, o2) -> Integer.compare(o1._3Pick, o2._3Pick);
    public static Comparator<Heroes> by_3PickAsc = (o1, o2) -> Integer.compare(o2._3Pick, o1._3Pick);
    public static Comparator<Heroes> by_3WinDesc = (o1, o2) -> Integer.compare(o1._3Win, o2._3Win);
    public static Comparator<Heroes> by_3WinAsc = (o1, o2) -> Integer.compare(o2._3Win, o1._3Win);
    public static Comparator<Heroes> by_4PickDesc = (o1, o2) -> Integer.compare(o1._4Pick, o2._4Pick);
    public static Comparator<Heroes> by_4PickAsc = (o1, o2) -> Integer.compare(o2._4Pick, o1._4Pick);
    public static Comparator<Heroes> by_4WinDesc = (o1, o2) -> Integer.compare(o1._4Win, o2._4Win);
    public static Comparator<Heroes> by_4WinAsc = (o1, o2) -> Integer.compare(o2._4Win, o1._4Win);
    public static Comparator<Heroes> by_5PickDesc = (o1, o2) -> Integer.compare(o1._5Pick, o2._5Pick);
    public static Comparator<Heroes> by_5PickAsc = (o1, o2) -> Integer.compare(o2._5Pick, o1._5Pick);
    public static Comparator<Heroes> by_5WinDesc = (o1, o2) -> Integer.compare(o1._5Win, o2._5Win);
    public static Comparator<Heroes> by_5WinAsc = (o1, o2) -> Integer.compare(o2._5Win, o1._5Win);
    public static Comparator<Heroes> by_6PickDesc = (o1, o2) -> Integer.compare(o1._6Pick, o2._6Pick);
    public static Comparator<Heroes> by_6PickAsc = (o1, o2) -> Integer.compare(o2._6Pick, o1._6Pick);
    public static Comparator<Heroes> by_6WinDesc = (o1, o2) -> Integer.compare(o1._6Win, o2._6Win);
    public static Comparator<Heroes> by_6WinAsc = (o1, o2) -> Integer.compare(o2._6Win, o1._6Win);
    public static Comparator<Heroes> by_7PickDesc = (o1, o2) -> Integer.compare(o1._7Pick, o2._7Pick);
    public static Comparator<Heroes> by_7PickAsc = (o1, o2) -> Integer.compare(o2._7Pick, o1._7Pick);
    public static Comparator<Heroes> by_7WinDesc = (o1, o2) -> Integer.compare(o1._7Win, o2._7Win);
    public static Comparator<Heroes> by_7WinAsc = (o1, o2) -> Integer.compare(o2._7Win, o1._7Win);
    public static Comparator<Heroes> by_8PickDesc = (o1, o2) -> Integer.compare(o1._8Pick, o2._8Pick);
    public static Comparator<Heroes> by_8PickAsc = (o1, o2) -> Integer.compare(o2._8Pick, o1._8Pick);
    public static Comparator<Heroes> by_8WinDesc = (o1, o2) -> Integer.compare(o1._8Win, o2._8Win);
    public static Comparator<Heroes> by_8WinAsc = (o1, o2) -> Integer.compare(o2._8Win, o1._8Win);

}
