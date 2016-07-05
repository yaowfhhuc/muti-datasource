package me.test.database.model;

import java.math.BigDecimal;
import java.util.Date;

public class NetElementDevice {
    private String emulateDevice;

    private Date timestamp;

    private Date startTime;

    private Date endTime;

    private String interfaceName;

    private String netElementName;

    private String apnName;

    private BigDecimal maxDelay;

    private BigDecimal minDelay;

    private BigDecimal avgDelay;

    private BigDecimal lossRate;

    private BigDecimal intId;

    public String getEmulateDevice() {
        return emulateDevice;
    }

    public void setEmulateDevice(String emulateDevice) {
        this.emulateDevice = emulateDevice;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getNetElementName() {
        return netElementName;
    }

    public void setNetElementName(String netElementName) {
        this.netElementName = netElementName;
    }

    public String getApnName() {
        return apnName;
    }

    public void setApnName(String apnName) {
        this.apnName = apnName;
    }

    public BigDecimal getMaxDelay() {
        return maxDelay;
    }

    public void setMaxDelay(BigDecimal maxDelay) {
        this.maxDelay = maxDelay;
    }

    public BigDecimal getMinDelay() {
        return minDelay;
    }

    public void setMinDelay(BigDecimal minDelay) {
        this.minDelay = minDelay;
    }

    public BigDecimal getAvgDelay() {
        return avgDelay;
    }

    public void setAvgDelay(BigDecimal avgDelay) {
        this.avgDelay = avgDelay;
    }

    public BigDecimal getLossRate() {
        return lossRate;
    }

    public void setLossRate(BigDecimal lossRate) {
        this.lossRate = lossRate;
    }

    public BigDecimal getIntId() {
        return intId;
    }

    public void setIntId(BigDecimal intId) {
        this.intId = intId;
    }
}