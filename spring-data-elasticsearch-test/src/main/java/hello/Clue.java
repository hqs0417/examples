package hello;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

/**
 * Created by unicorn on 2016/11/18.
 */
@Document(indexName = "bjksrs", type = "clue")
public class Clue {
    @Id
    private String id;

    @JsonProperty("major_markets")
    private String majorMarkets;

    private String revenue;

    @JsonProperty("employ_cnt")
    private String employeeCount;

    @JsonProperty("bus_mode")
    private String busMode;

    @JsonProperty("name_score")
    private String nameScore;

    @JsonProperty("icp_domain")
    private String icpDomain;

    @JsonProperty("room_area")
    private String roomArea;

    @JsonProperty("ic_cert")
    private String icCert;

    @JsonProperty("month_yield")
    private String monthYield;

    @JsonProperty("ic_status")
    private String icStatus;

    @JsonProperty("cust_type")
    private String custType;

    @JsonProperty("cert_year")
    private String certYear;

    private String city;

    private String uptime;

    @JsonProperty("home_urls")
    private List<String> homeUrls;

    private List<Contact> contacts;

    private String products;

    @JsonProperty("reg_no")
    private String regNo;

    private String legal;

    @JsonProperty("icp_no")
    private String icpNo;

    @JsonProperty("eff_time")
    private String effTime;

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("major_custs")
    private String majorCusts;

    @JsonProperty("reg_office")
    private String regOffice;

    @JsonProperty("kebao_statid")
    private String kebaoStatId;

    private String email;

    private List<String> mobiles;

    @JsonProperty("zip_code")
    private String zipCode;

    @JsonProperty("province")
    private String province;

    private String fax;

    @JsonProperty("icp_sitename")
    private String icpSiteName;

    private String description;

    @JsonProperty("scope_score")
    private String scopeScore;

    private String brand;

    @JsonProperty("import_volume")
    private String importVolume;

    @JsonProperty("source_url")
    private String sourceUrl;

    @JsonProperty("reg_addr")
    private String regAddr;

    @JsonProperty("address")
    private String address;

    @JsonProperty("bus_scope")
    private String busScope;

    @JsonProperty("ic_cap")
    private String icCap;

    @JsonProperty("est_time")
    private String estTime;

    @JsonProperty
    private Integer rcCnt;

    @JsonProperty("trade_filter1")
    private String tradeFilter1;

    @JsonProperty("trade_filter2")
    private String tradeFilter2;

    @JsonProperty("order_probability")
    private String orderProbability;

    @JsonProperty("icp_type")
    private String icpType;

    @JsonProperty("has_tel")
    private String hasTel;

    @JsonProperty("export_volume")
    private String exportVolume;

    @JsonProperty("icp_email")
    private String icpEmail;

    private List<String> telephones;

    private List<String> urls;

    @JsonProperty("source_urls")
    private List<String> sourceUrls;

    @JsonProperty("trade_level1")
    private String tradeLevel1;

    @JsonProperty("trade_level2")
    private String tradeLevel2;

    @JsonProperty("icp_status")
    private String icpStatus;

    public static class Contact{
        private String duty;
        private String tels;
        private String name;
        private String phoneImgUrl;
        private String mobs;
        private String email;

        public String getDuty() {
            return duty;
        }

        public void setDuty(String duty) {
            this.duty = duty;
        }

        public String getTels() {
            return tels;
        }

        public void setTels(String tels) {
            this.tels = tels;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneImgUrl() {
            return phoneImgUrl;
        }

        public void setPhoneImgUrl(String phoneImgUrl) {
            this.phoneImgUrl = phoneImgUrl;
        }

        public String getMobs() {
            return mobs;
        }

        public void setMobs(String mobs) {
            this.mobs = mobs;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajorMarkets() {
        return majorMarkets;
    }

    public void setMajorMarkets(String majorMarkets) {
        this.majorMarkets = majorMarkets;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(String employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getBusMode() {
        return busMode;
    }

    public void setBusMode(String busMode) {
        this.busMode = busMode;
    }

    public String getNameScore() {
        return nameScore;
    }

    public void setNameScore(String nameScore) {
        this.nameScore = nameScore;
    }

    public String getIcpDomain() {
        return icpDomain;
    }

    public void setIcpDomain(String icpDomain) {
        this.icpDomain = icpDomain;
    }

    public String getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea;
    }

    public String getIcCert() {
        return icCert;
    }

    public void setIcCert(String icCert) {
        this.icCert = icCert;
    }

    public String getMonthYield() {
        return monthYield;
    }

    public void setMonthYield(String monthYield) {
        this.monthYield = monthYield;
    }

    public String getIcStatus() {
        return icStatus;
    }

    public void setIcStatus(String icStatus) {
        this.icStatus = icStatus;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCertYear() {
        return certYear;
    }

    public void setCertYear(String certYear) {
        this.certYear = certYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public List<String> getHomeUrls() {
        return homeUrls;
    }

    public void setHomeUrls(List<String> homeUrls) {
        this.homeUrls = homeUrls;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getIcpNo() {
        return icpNo;
    }

    public void setIcpNo(String icpNo) {
        this.icpNo = icpNo;
    }

    public String getEffTime() {
        return effTime;
    }

    public void setEffTime(String effTime) {
        this.effTime = effTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMajorCusts() {
        return majorCusts;
    }

    public void setMajorCusts(String majorCusts) {
        this.majorCusts = majorCusts;
    }

    public String getRegOffice() {
        return regOffice;
    }

    public void setRegOffice(String regOffice) {
        this.regOffice = regOffice;
    }

    public String getKebaoStatId() {
        return kebaoStatId;
    }

    public void setKebaoStatId(String kebaoStatId) {
        this.kebaoStatId = kebaoStatId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getIcpSiteName() {
        return icpSiteName;
    }

    public void setIcpSiteName(String icpSiteName) {
        this.icpSiteName = icpSiteName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScopeScore() {
        return scopeScore;
    }

    public void setScopeScore(String scopeScore) {
        this.scopeScore = scopeScore;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImportVolume() {
        return importVolume;
    }

    public void setImportVolume(String importVolume) {
        this.importVolume = importVolume;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getRegAddr() {
        return regAddr;
    }

    public void setRegAddr(String regAddr) {
        this.regAddr = regAddr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusScope() {
        return busScope;
    }

    public void setBusScope(String busScope) {
        this.busScope = busScope;
    }

    public String getIcCap() {
        return icCap;
    }

    public void setIcCap(String icCap) {
        this.icCap = icCap;
    }

    public String getEstTime() {
        return estTime;
    }

    public void setEstTime(String estTime) {
        this.estTime = estTime;
    }

    public Integer getRcCnt() {
        return rcCnt;
    }

    public void setRcCnt(Integer rcCnt) {
        this.rcCnt = rcCnt;
    }

    public String getTradeFilter1() {
        return tradeFilter1;
    }

    public void setTradeFilter1(String tradeFilter1) {
        this.tradeFilter1 = tradeFilter1;
    }

    public String getTradeFilter2() {
        return tradeFilter2;
    }

    public void setTradeFilter2(String tradeFilter2) {
        this.tradeFilter2 = tradeFilter2;
    }

    public String getOrderProbability() {
        return orderProbability;
    }

    public void setOrderProbability(String orderProbability) {
        this.orderProbability = orderProbability;
    }

    public String getIcpType() {
        return icpType;
    }

    public void setIcpType(String icpType) {
        this.icpType = icpType;
    }

    public String getHasTel() {
        return hasTel;
    }

    public void setHasTel(String hasTel) {
        this.hasTel = hasTel;
    }

    public String getExportVolume() {
        return exportVolume;
    }

    public void setExportVolume(String exportVolume) {
        this.exportVolume = exportVolume;
    }

    public String getIcpEmail() {
        return icpEmail;
    }

    public void setIcpEmail(String icpEmail) {
        this.icpEmail = icpEmail;
    }

    public List<String> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<String> telephones) {
        this.telephones = telephones;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getSourceUrls() {
        return sourceUrls;
    }

    public void setSourceUrls(List<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
    }

    public String getTradeLevel1() {
        return tradeLevel1;
    }

    public void setTradeLevel1(String tradeLevel1) {
        this.tradeLevel1 = tradeLevel1;
    }

    public String getTradeLevel2() {
        return tradeLevel2;
    }

    public void setTradeLevel2(String tradeLevel2) {
        this.tradeLevel2 = tradeLevel2;
    }

    public String getIcpStatus() {
        return icpStatus;
    }

    public void setIcpStatus(String icpStatus) {
        this.icpStatus = icpStatus;
    }
}
