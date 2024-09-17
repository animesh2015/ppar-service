package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.lang.Error;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-29T07:00:55.980193590Z[GMT]")
@RestController
public class PPARSwaggerApiController implements PPARSwaggerApi {

    private static final Logger log = LoggerFactory.getLogger(PPARSwaggerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PPARSwaggerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> pPARSwaggerPPARFlagSetupInterPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody InterSetupRequest body
    ) {
        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"bblRegistrationId\" : \"000000900238\",\n  \"proxyType\" : \"MSISDN\",\n  \"proxyValue\" : \"0913334444\"\n}", InterSetupResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARFlagSetupRtpPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody RTPSetupRequest body
    ) {
        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"bblRegistrationId\" : \"000000900238\",\n  \"proxyType\" : \"MSISDN\",\n  \"proxyValue\" : \"0913334444\"\n}", RTPSetupResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARInquiryBranchPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody BranchRequest body
    ) {
        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"deregisterTotal\" : 6,\n  \"registerByTAX\" : 7,\n  \"registerByMobile\" : 5,\n  \"updateACTotal\" : 3,\n  \"dateOfTransaction\" : \"20240401\",\n  \"deregisterByID\" : 5,\n  \"deregisterByTAX\" : 9,\n  \"registerByID\" : 1,\n  \"teller\" : \"0000000002\",\n  \"registerTotal\" : 0,\n  \"deregisterByMobile\" : 2,\n  \"branchNo\" : \"000098\"\n}", BranchResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARInquiryDailyPost(@Parameter(in = ParameterIn.HEADER, description = "", required = false, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = false) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = false, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = false) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = false, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = false) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = false, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = false) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody DailyRequest body
    ) {
        try {
            //int i = 1/0;
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"anyIDRecords\" : [ {\n    \"accountValue\" : \"1180000018\",\n    \"accountForTransferFromGovernment\" : \"\",\n    \"referenceNo\" : \"010124000051\",\n    \"accountForTransferFromPersonal\" : \"\",\n    \"transactionStatus\" : \"AP\",\n    \"accountType\" : \"SA\",\n    \"accountCodeForGovernment\" : \"G\",\n    \"proxyType\" : \"MSISDN\",\n    \"proxyValueForDisplay\" : \"0911112222\",\n    \"accountCodeForPersonal\" : \"P\",\n    \"approveTeller\" : \"0000000002\",\n    \"proxyValue\" : \"0911112222\",\n    \"transactionType\" : \"DEREGIS\",\n    \"anyIDNo\" : \"341556758678\",\n    \"accountCodeForCommercial\" : \"C\",\n    \"approveTime\" : \"123000\",\n    \"accountForTransferFromCommercial\" : \"\"\n  }, {\n    \"accountValue\" : \"1180000018\",\n    \"accountForTransferFromGovernment\" : \"\",\n    \"referenceNo\" : \"010124000051\",\n    \"accountForTransferFromPersonal\" : \"\",\n    \"transactionStatus\" : \"AP\",\n    \"accountType\" : \"SA\",\n    \"accountCodeForGovernment\" : \"G\",\n    \"proxyType\" : \"MSISDN\",\n    \"proxyValueForDisplay\" : \"0911112222\",\n    \"accountCodeForPersonal\" : \"P\",\n    \"approveTeller\" : \"0000000002\",\n    \"proxyValue\" : \"0911112222\",\n    \"transactionType\" : \"DEREGIS\",\n    \"anyIDNo\" : \"341556758678\",\n    \"accountCodeForCommercial\" : \"C\",\n    \"approveTime\" : \"123000\",\n    \"accountForTransferFromCommercial\" : \"\"\n  } ],\n  \"searchKey\" : \"010124000050\",\n  \"numberOfReturn\" : 1\n}", DailyResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error("Error data"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARInquiryPromptpayINQ2Post(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody PromptpayRequest body
    ) {
        try {
            //int i = 1/0;
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"anyIDLists\" : [ {\n    \"bblRegistrationID\" : \"11111111245\",\n    \"accountValue\" : \"1180000018\",\n    \"registrationStatus\" : \"\",\n    \"updateDate\" : \"\",\n    \"addTime\" : \"153047\",\n    \"addBranch\" : \"000098\",\n    \"updateFromChannel\" : \"\",\n    \"updateBranch\" : \"\",\n    \"rtpNotiLang\" : \"EN\",\n    \"interFlag\" : \"Y\",\n    \"updateTerminal\" : \"\",\n    \"rtpNotiPhoneNo\" : \"0913334444\",\n    \"anyIDNo\" : \"341556758678\",\n    \"updateTeller\" : \"\",\n    \"rtpNotiEmail\" : \"Camila@gmail.com\",\n    \"accountType\" : \"SA\",\n    \"proxyType\" : \"MSISDN\",\n    \"updateTime\" : \"\",\n    \"addDate\" : \"20230524\",\n    \"proxyValue\" : \"5131453523565689\",\n    \"addFromChannel\" : \"B\",\n    \"addTeller\" : \"\",\n    \"rtpNotiBan\" : \"0000202306150001\",\n    \"addTerminal\" : \"\",\n    \"itmxRegistrationID\" : \"34535346546576\",\n    \"rtpFlag\" : \"Y\"\n  }, {\n    \"bblRegistrationID\" : \"11111111245\",\n    \"accountValue\" : \"1180000018\",\n    \"registrationStatus\" : \"\",\n    \"updateDate\" : \"\",\n    \"addTime\" : \"153047\",\n    \"addBranch\" : \"000098\",\n    \"updateFromChannel\" : \"\",\n    \"updateBranch\" : \"\",\n    \"rtpNotiLang\" : \"EN\",\n    \"interFlag\" : \"Y\",\n    \"updateTerminal\" : \"\",\n    \"rtpNotiPhoneNo\" : \"0913334444\",\n    \"anyIDNo\" : \"341556758678\",\n    \"updateTeller\" : \"\",\n    \"rtpNotiEmail\" : \"Camila@gmail.com\",\n    \"accountType\" : \"SA\",\n    \"proxyType\" : \"MSISDN\",\n    \"updateTime\" : \"\",\n    \"addDate\" : \"20230524\",\n    \"proxyValue\" : \"5131453523565689\",\n    \"addFromChannel\" : \"B\",\n    \"addTeller\" : \"\",\n    \"rtpNotiBan\" : \"0000202306150001\",\n    \"addTerminal\" : \"\",\n    \"itmxRegistrationID\" : \"34535346546576\",\n    \"rtpFlag\" : \"Y\"\n  } ],\n  \"searchKey\" : \"010124000050\",\n  \"numberOfReturn\" : 1\n}", PromptpayResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error("Error data"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARInquiryVerifyDeregisterPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody DeregisterRequest body
    ) {
        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"accountValue\" : \"1180000018\",\n  \"bblRegistrationID\" : \"000000476469\",\n  \"anyIDNo\" : \"0000102211221234\",\n  \"accountType\" : \"SA\",\n  \"itmxRegistrationID\" : \"\"\n}", DeregisterResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARLookupPromptpaylookupPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody PromptPayLookUpRequest body
    ) {
        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"toEwalletServiceProviderInformation\" : \"\",\n  \"toRTPInformation\" : \"\",\n  \"toAccountType\" : \"BANKAC\",\n  \"toAccountFromAIRSOrRequestMessageRTP\" : \"\",\n  \"fromAccountInformation\" : {\n    \"bankCode\" : \"002\",\n    \"accountControls\" : \"21112220000\",\n    \"itmxFlag\" : \" \",\n    \"filler1\" : \"\",\n    \"customerThaiName\" : \"นาย อุดม น้ำใจ\",\n    \"accountStatusDescription\" : \"Active\",\n    \"accountID\" : \"IM\",\n    \"customerEngName\" : \"Mrs. Audom Namjai\",\n    \"errorIndicator\" : \"\",\n    \"accountIDType\" : \"CA\",\n    \"accountNo\" : \"021112220005\",\n    \"accountStatusCode\" : \"00\",\n    \"filler\" : \"\",\n    \"accountEngName\" : \"Mrs. Audom Namjai\",\n    \"accountPC\" : \"P\",\n    \"accountThaiName\" : \"นาย อุดม น้ำ\",\n    \"accountIDNumber\" : \"6891024746820\"\n  },\n  \"fromAccountFromAIRSOrRequestMessageRTP\" : \"\",\n  \"toAccountValue\" : \"0000000009\",\n  \"interFlag\" : \"Y\"\n}", PromptPayLookUpAndRTPResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARLookupPromptpaylookupRtpPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody PromptPayRTPLookUpRequest body
    ) {

        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"toEwalletServiceProviderInformation\" : \"\",\n  \"toRTPInformation\" : \"\",\n  \"toAccountType\" : \"BANKAC\",\n  \"toAccountFromAIRSOrRequestMessageRTP\" : \"\",\n  \"fromAccountInformation\" : {\n    \"bankCode\" : \"002\",\n    \"accountControls\" : \"21112220000\",\n    \"itmxFlag\" : \" \",\n    \"filler1\" : \"\",\n    \"customerThaiName\" : \"นาย อุดม น้ำใจ\",\n    \"accountStatusDescription\" : \"Active\",\n    \"accountID\" : \"IM\",\n    \"customerEngName\" : \"Mrs. Audom Namjai\",\n    \"errorIndicator\" : \"\",\n    \"accountIDType\" : \"CA\",\n    \"accountNo\" : \"021112220005\",\n    \"accountStatusCode\" : \"00\",\n    \"filler\" : \"\",\n    \"accountEngName\" : \"Mrs. Audom Namjai\",\n    \"accountPC\" : \"P\",\n    \"accountThaiName\" : \"นาย อุดม น้ำ\",\n    \"accountIDNumber\" : \"6891024746820\"\n  },\n  \"fromAccountFromAIRSOrRequestMessageRTP\" : \"\",\n  \"toAccountValue\" : \"0000000009\",\n  \"interFlag\" : \"Y\"\n}", PromptPayLookUpAndRTPResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARRegisterChangeAccountPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody CHACRequest body
    ) {
        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"date\" : \"20240515\",\n  \"bblRegistrationId\" : \"000002101043\",\n  \"needOverride1\" : \"\",\n  \"referenceNo\" : \"009824003028\",\n  \"anyIdNo\" : \"0000102211221234\",\n  \"time\" : \"132247\",\n  \"authorizeToProcessCode\" : \"\",\n  \"needOverride2\" : \"\",\n  \"needOverride3\" : \"\",\n  \"needOverride4\" : \"\",\n  \"needOverride5\" : \"\"\n}", CHACResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> pPARSwaggerPPARRegisterDeregisterPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody DGISRequest body
    ) {
        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"date\" : \"20240515\",\n  \"bblRegistrationId\" : \"000002101043\",\n  \"referenceNo\" : \"009824003038\",\n  \"anyIdNo\" : \"0000500000000010\",\n  \"time\" : \"172624\",\n  \"itmxRegistrationId\" : \"100186621097\",\n  \"itmxResponse\" : \"000\"\n}", DGISResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public ResponseEntity<Object> pPARSwaggerPPARRegisterRegisterPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody RGISRequest body
    ) {

        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"date\" : \"20240528\",\n  \"returnCode\" : \"\",\n  \"bblRegistrationId\" : \"000002101044\",\n  \"referenceNo\" : \"010124000181\",\n  \"anyIdNo\" : \"0000102211221234\",\n  \"time\" : \"101127\",\n  \"itmxRegistrationId\" : \"100187355772\",\n  \"itmxResponse\" : \"000\"\n}", RGISResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public ResponseEntity<Object> pPARSwaggerPPARRegisterVerifyPost(@Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Branch", required = true) String bbLBranch
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Channel", required = true) String bbLChannel
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Teller", required = true) String bbLTeller
            , @Parameter(in = ParameterIn.HEADER, description = "", required = true, schema = @Schema()) @RequestHeader(value = "BBL-Terminal", required = true) String bbLTerminal
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())  @RequestBody VerifyRequest body
    ) {

        try {
            return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"idType\" : \"CI\",\n  \"needOverride1\" : \"\",\n  \"accountName\" : \"ตั้งตรง มีนา\",\n  \"accountNameFromGrovernment\" : \"1\",\n  \"rMNo\" : \"0000202306150001\",\n  \"warningMessage\" : [ {\n    \"warningValue\" : \"หมายเลขโทรศัพท์มือถือไม่ตรงกับหมายเลขที่ให้ไว้กับธนาคาร\"\n  }, {\n    \"warningValue\" : \"หมายเลขโทรศัพท์มือถือไม่ตรงกับหมายเลขที่ให้ไว้กับธนาคาร\"\n  } ],\n  \"noOfWarningMessage\" : 1,\n  \"idNo\" : \"1521100115555\",\n  \"customerName\" : \"ตั้งตรง มีนา\",\n  \"otpReferenceId\" : \"\",\n  \"anyIdNo\" : \"\",\n  \"pCOfCustomer\" : \"P\",\n  \"customerPrefix\" : \"นาย\",\n  \"accountNameFromCommercial\" : \"2\",\n  \"accountNameFromPersonal\" : \"3\",\n  \"needOverride2\" : \"\",\n  \"authorizeToProcessCode\" : \"\",\n  \"needOverride3\" : \"\",\n  \"needOverride4\" : \"\",\n  \"needOverride5\" : \"\"\n}", VerifyResponse.class), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Object>(new Error(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
