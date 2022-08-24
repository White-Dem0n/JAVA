# intern
buy and sell nft using erc20 coins


// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.7.0 <0.9.0;

contract Transaction {

    uint public priceByNft;
    

    event Transfer(address indexed from, address indexed to, uint tokens);

    struct Doc {
        address buyer;
        address seller;
        int nftId;
    }

    mapping(address => uint256) balances;

    uint256 totalSupply_;


    constructor(uint256 total) {
        totalSupply_ = total;
        balances[msg.buyer] = totalSupply_;
    }

    Doc[] Nfts;

    function listDoc(int nftId, int priceByToken) public{
    }

    mapping (address => Doc) Transactions;

    function buy(address receiver, uint numTokens) public returns (bool) {
        require(totalSupply_ <= balances[msg.buyer]);
        balances[msg.buyer] -= numTokens;
        balances[msg.seller] += numTokens;
        emit Transfer(msg.buyer, msg.eller, numTokens);
        Nfts += listDoc;
        return true;
    }

    function sell(address receiver, uint numTokens) public returns (bool) {
        require(Nfts.length != 0);
        balances[msg.seller] -= numTokens;
        balances[msg.buyer] += numTokens;
        emit Transfer(msg.seller, msg.buyer, numTokens);
        Nfts -= listDoc;
        return true;
    }

    function buy(address buyer, address seller, int nftId) public{
        
    }


}

