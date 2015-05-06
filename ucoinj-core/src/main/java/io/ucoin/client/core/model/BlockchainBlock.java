package io.ucoin.client.core.model;

/*
 * #%L
 * UCoin Java Client :: Core API
 * %%
 * Copyright (C) 2014 - 2015 EIS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import java.io.Serializable;
import java.util.List;

/**
 * A block from the blockchain.
 * 
 * @author Benoit Lavenier <benoit.lavenier@e-is.pro>
 * @since 1.0
 */
public class BlockchainBlock implements Serializable {

    private static final long serialVersionUID = -5598140972293452669L;
    
    private String version;
    private Integer nonce;
    private Integer powMin;
    private Integer number;
	private Integer time;
    private Integer medianTime;
    private Integer membersCount;
    private Long monetaryMass;
    private String currency;
    private String issuer;
    private String signature;
    private String hash;
    private String parameters;
    private String previousHash;
    private String previousIssuer;
    private Integer dividend;
    //private int memberChanges;
    private List<Identity> identities;
    private List<Member> joiners;
//            private int actives": [],
//            private int leavers": [],
//            private int excluded": [],
//            private int certifications": [],
//            private int transactions": [],

//            private int raw": "Version: 1\nType: Block\nCurrency: zeta_brouzouf\nNonce: 8233\nNumber: 1\nDate: 1416589860\nConfirmedDate: 1416589860\nIssuer: HnFcSms8jzwngtVomTTnzudZx7SHUQY8sVE1y8yBmULk\nPreviousHash: 00006CD96A01378465318E48310118AC6B2F3625\nPreviousIssuer: HnFcSms8jzwngtVomTTnzudZx7SHUQY8sVE1y8yBmULk\nMembersCount: 4\nIdentities:\nJoiners:\nActives:\nLeavers:\nExcluded:\nCertifications:\nTransactions:\n"
    //private String raw;

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public Integer getNonce() {
        return nonce;
    }
    public void setNonce(Integer nonce) {
        this.nonce = nonce;
    }

    public Integer getPowMin() {
        return powMin;
    }

    public void setPowMin(Integer powMin) {
        this.powMin = powMin;
    }

    public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
    public Integer getTime() {
        return time;
    }
    public void setTime(Integer time) {
        this.time = time;
    }
    public Integer getMedianTime() {
        return medianTime;
    }
    public void setMedianTime(Integer medianTime) {
        this.medianTime = medianTime;
    }
    public Integer getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public Long getMonetaryMass() {
        return monetaryMass;
    }

    public void setMonetaryMass(Long monetaryMass) {
        this.monetaryMass = monetaryMass;
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getIssuer() {
        return issuer;
    }
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getHash() {
        return hash;
    }
    public void setHash(String hash) {
        this.hash = hash;
    }
    public String getParameters() {
        return parameters;
    }
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
    public String getPreviousHash() {
        return previousHash;
    }
    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
    public String getPreviousIssuer() {
        return previousIssuer;
    }
    public void setPreviousIssuer(String previousIssuer) {
        this.previousIssuer = previousIssuer;
    }
    public Integer getDividend() {
        return dividend;
    }
    public void setDividend(Integer dividend) {
        this.dividend = dividend;
    }
    public List<Identity> getIdentities() {
        return identities;
    }
    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
    }
    public List<Member> getJoiners() {
        return joiners;
    }
    public void setJoiners(List<Member> joiners) {
        this.joiners = joiners;
    }
}
