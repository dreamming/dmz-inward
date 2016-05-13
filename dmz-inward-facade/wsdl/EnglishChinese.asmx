<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://WebXml.com.cn/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://WebXml.com.cn/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; &lt;strong&gt;中文&amp;lt;-&amp;gt;英文双向翻译WEB服务，永久免费&lt;/strong&gt;。提供词典翻译、音标（拼音）、解释、相关词条、例句、读音（英文Only）、候选词等功能。&lt;/br&gt;传递中文参数请使用UTF-8编码，使用本站WEB服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持！&lt;br /&gt;&lt;br /&gt;&lt;img alt="Ject.cn" title="www.Ject.cn" src="http://www.ject.cn/images/ject_logo_1616.gif" style="vertical-align: middle;" /&gt; &lt;a href="http://www.ject.cn/" target="_blank"&gt;中英文双向翻译网站 &lt;img alt="Zip" title="Zip file" src="http://www.ject.cn/images/icon/zip.gif" style="vertical-align: middle;" /&gt; .Net实例下载&lt;/a&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;img alt="PDF" title="PDF file" src="http://www.ject.cn/images/icon/pdf.gif" style="vertical-align: middle;" /&gt; &lt;a href="http://fy.webxml.com.cn/files/TranslatorWebServiceHelp.pdf" target="_blank"&gt;接口开发帮助文档&lt;/a&gt;&lt;br /&gt;&lt;br /&gt;&amp;nbsp;</wsdl:documentation>
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://WebXml.com.cn/">
      <s:element name="Translator">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="wordKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TranslatorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TranslatorResult">
              <s:complexType>
                <s:sequence>
                    <s:any minOccurs="2" maxOccurs="2"/>
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TranslatorString">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="wordKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TranslatorStringResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TranslatorStringResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="TranslatorReferString">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="wordKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TranslatorReferStringResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TranslatorReferStringResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TranslatorSentenceString">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="wordKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TranslatorSentenceStringResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TranslatorSentenceStringResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SuggestWord">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="wordKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SuggestWordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SuggestWordResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMp3">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Mp3" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMp3Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMp3Result" type="s:base64Binary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DataSet" nillable="true">
        <s:complexType>
          <s:sequence>
                <s:any minOccurs="2" maxOccurs="2"/>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ArrayOfString" nillable="true" type="tns:ArrayOfString" />
      <s:element name="base64Binary" nillable="true" type="s:base64Binary" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="TranslatorSoapIn">
    <wsdl:part name="parameters" element="tns:Translator" />
  </wsdl:message>
  <wsdl:message name="TranslatorSoapOut">
    <wsdl:part name="parameters" element="tns:TranslatorResponse" />
  </wsdl:message>
  <wsdl:message name="TranslatorStringSoapIn">
    <wsdl:part name="parameters" element="tns:TranslatorString" />
  </wsdl:message>
  <wsdl:message name="TranslatorStringSoapOut">
    <wsdl:part name="parameters" element="tns:TranslatorStringResponse" />
  </wsdl:message>
  <wsdl:message name="TranslatorReferStringSoapIn">
    <wsdl:part name="parameters" element="tns:TranslatorReferString" />
  </wsdl:message>
  <wsdl:message name="TranslatorReferStringSoapOut">
    <wsdl:part name="parameters" element="tns:TranslatorReferStringResponse" />
  </wsdl:message>
  <wsdl:message name="TranslatorSentenceStringSoapIn">
    <wsdl:part name="parameters" element="tns:TranslatorSentenceString" />
  </wsdl:message>
  <wsdl:message name="TranslatorSentenceStringSoapOut">
    <wsdl:part name="parameters" element="tns:TranslatorSentenceStringResponse" />
  </wsdl:message>
  <wsdl:message name="SuggestWordSoapIn">
    <wsdl:part name="parameters" element="tns:SuggestWord" />
  </wsdl:message>
  <wsdl:message name="SuggestWordSoapOut">
    <wsdl:part name="parameters" element="tns:SuggestWordResponse" />
  </wsdl:message>
  <wsdl:message name="GetMp3SoapIn">
    <wsdl:part name="parameters" element="tns:GetMp3" />
  </wsdl:message>
  <wsdl:message name="GetMp3SoapOut">
    <wsdl:part name="parameters" element="tns:GetMp3Response" />
  </wsdl:message>
  <wsdl:message name="TranslatorHttpGetIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorHttpGetOut">
    <wsdl:part name="Body" element="tns:DataSet" />
  </wsdl:message>
  <wsdl:message name="TranslatorStringHttpGetIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorStringHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="TranslatorReferStringHttpGetIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorReferStringHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="TranslatorSentenceStringHttpGetIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorSentenceStringHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="SuggestWordHttpGetIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="SuggestWordHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="GetMp3HttpGetIn">
    <wsdl:part name="Mp3" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetMp3HttpGetOut">
    <wsdl:part name="Body" element="tns:base64Binary" />
  </wsdl:message>
  <wsdl:message name="TranslatorHttpPostIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorHttpPostOut">
    <wsdl:part name="Body" element="tns:DataSet" />
  </wsdl:message>
  <wsdl:message name="TranslatorStringHttpPostIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorStringHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="TranslatorReferStringHttpPostIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorReferStringHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="TranslatorSentenceStringHttpPostIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="TranslatorSentenceStringHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="SuggestWordHttpPostIn">
    <wsdl:part name="wordKey" type="s:string" />
  </wsdl:message>
  <wsdl:message name="SuggestWordHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfString" />
  </wsdl:message>
  <wsdl:message name="GetMp3HttpPostIn">
    <wsdl:part name="Mp3" type="s:string" />
  </wsdl:message>
  <wsdl:message name="GetMp3HttpPostOut">
    <wsdl:part name="Body" element="tns:base64Binary" />
  </wsdl:message>
  <wsdl:portType name="EnglishChineseSoap">
    <wsdl:operation name="Translator">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：DataSet。（包括全部数据三个DataTable）&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorSoapIn" />
      <wsdl:output message="tns:TranslatorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（基本）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorStringSoapIn" />
      <wsdl:output message="tns:TranslatorStringSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorReferString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（相关词条）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorReferStringSoapIn" />
      <wsdl:output message="tns:TranslatorReferStringSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorSentenceString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（例句）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorSentenceStringSoapIn" />
      <wsdl:output message="tns:TranslatorSentenceStringSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SuggestWord">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得候选词&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:SuggestWordSoapIn" />
      <wsdl:output message="tns:SuggestWordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMp3">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得朗读MP3字节流&lt;/h3&gt;&lt;p&gt;输入参数：Mp3 = Mp3名称； 返回数据：字节数组 Byte[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:GetMp3SoapIn" />
      <wsdl:output message="tns:GetMp3SoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="EnglishChineseHttpGet">
    <wsdl:operation name="Translator">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：DataSet。（包括全部数据三个DataTable）&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorHttpGetIn" />
      <wsdl:output message="tns:TranslatorHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（基本）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorStringHttpGetIn" />
      <wsdl:output message="tns:TranslatorStringHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorReferString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（相关词条）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorReferStringHttpGetIn" />
      <wsdl:output message="tns:TranslatorReferStringHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorSentenceString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（例句）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorSentenceStringHttpGetIn" />
      <wsdl:output message="tns:TranslatorSentenceStringHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="SuggestWord">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得候选词&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:SuggestWordHttpGetIn" />
      <wsdl:output message="tns:SuggestWordHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMp3">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得朗读MP3字节流&lt;/h3&gt;&lt;p&gt;输入参数：Mp3 = Mp3名称； 返回数据：字节数组 Byte[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:GetMp3HttpGetIn" />
      <wsdl:output message="tns:GetMp3HttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="EnglishChineseHttpPost">
    <wsdl:operation name="Translator">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：DataSet。（包括全部数据三个DataTable）&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorHttpPostIn" />
      <wsdl:output message="tns:TranslatorHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（基本）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorStringHttpPostIn" />
      <wsdl:output message="tns:TranslatorStringHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorReferString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（相关词条）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorReferStringHttpPostIn" />
      <wsdl:output message="tns:TranslatorReferStringHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="TranslatorSentenceString">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;中英文双向翻译（例句）String()&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:TranslatorSentenceStringHttpPostIn" />
      <wsdl:output message="tns:TranslatorSentenceStringHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="SuggestWord">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得候选词&lt;/h3&gt;&lt;p&gt;输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:SuggestWordHttpPostIn" />
      <wsdl:output message="tns:SuggestWordHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMp3">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得朗读MP3字节流&lt;/h3&gt;&lt;p&gt;输入参数：Mp3 = Mp3名称； 返回数据：字节数组 Byte[]。&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:GetMp3HttpPostIn" />
      <wsdl:output message="tns:GetMp3HttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="EnglishChineseSoap" type="tns:EnglishChineseSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Translator">
      <soap:operation soapAction="http://WebXml.com.cn/Translator" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorString">
      <soap:operation soapAction="http://WebXml.com.cn/TranslatorString" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorReferString">
      <soap:operation soapAction="http://WebXml.com.cn/TranslatorReferString" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorSentenceString">
      <soap:operation soapAction="http://WebXml.com.cn/TranslatorSentenceString" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SuggestWord">
      <soap:operation soapAction="http://WebXml.com.cn/SuggestWord" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMp3">
      <soap:operation soapAction="http://WebXml.com.cn/GetMp3" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="EnglishChineseSoap12" type="tns:EnglishChineseSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Translator">
      <soap12:operation soapAction="http://WebXml.com.cn/Translator" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorString">
      <soap12:operation soapAction="http://WebXml.com.cn/TranslatorString" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorReferString">
      <soap12:operation soapAction="http://WebXml.com.cn/TranslatorReferString" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorSentenceString">
      <soap12:operation soapAction="http://WebXml.com.cn/TranslatorSentenceString" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SuggestWord">
      <soap12:operation soapAction="http://WebXml.com.cn/SuggestWord" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMp3">
      <soap12:operation soapAction="http://WebXml.com.cn/GetMp3" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="EnglishChineseHttpGet" type="tns:EnglishChineseHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="Translator">
      <http:operation location="/Translator" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorString">
      <http:operation location="/TranslatorString" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorReferString">
      <http:operation location="/TranslatorReferString" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorSentenceString">
      <http:operation location="/TranslatorSentenceString" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SuggestWord">
      <http:operation location="/SuggestWord" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMp3">
      <http:operation location="/GetMp3" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="EnglishChineseHttpPost" type="tns:EnglishChineseHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="Translator">
      <http:operation location="/Translator" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorString">
      <http:operation location="/TranslatorString" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorReferString">
      <http:operation location="/TranslatorReferString" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TranslatorSentenceString">
      <http:operation location="/TranslatorSentenceString" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SuggestWord">
      <http:operation location="/SuggestWord" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMp3">
      <http:operation location="/GetMp3" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="EnglishChinese">
    <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; &lt;strong&gt;中文&amp;lt;-&amp;gt;英文双向翻译WEB服务，永久免费&lt;/strong&gt;。提供词典翻译、音标（拼音）、解释、相关词条、例句、读音（英文Only）、候选词等功能。&lt;/br&gt;传递中文参数请使用UTF-8编码，使用本站WEB服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持！&lt;br /&gt;&lt;br /&gt;&lt;img alt="Ject.cn" title="www.Ject.cn" src="http://www.ject.cn/images/ject_logo_1616.gif" style="vertical-align: middle;" /&gt; &lt;a href="http://www.ject.cn/" target="_blank"&gt;中英文双向翻译网站 &lt;img alt="Zip" title="Zip file" src="http://www.ject.cn/images/icon/zip.gif" style="vertical-align: middle;" /&gt; .Net实例下载&lt;/a&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&lt;img alt="PDF" title="PDF file" src="http://www.ject.cn/images/icon/pdf.gif" style="vertical-align: middle;" /&gt; &lt;a href="http://fy.webxml.com.cn/files/TranslatorWebServiceHelp.pdf" target="_blank"&gt;接口开发帮助文档&lt;/a&gt;&lt;br /&gt;&lt;br /&gt;&amp;nbsp;</wsdl:documentation>
    <wsdl:port name="EnglishChineseSoap" binding="tns:EnglishChineseSoap">
      <soap:address location="http://fy.webxml.com.cn/webservices/EnglishChinese.asmx" />
    </wsdl:port>
    <wsdl:port name="EnglishChineseSoap12" binding="tns:EnglishChineseSoap12">
      <soap12:address location="http://fy.webxml.com.cn/webservices/EnglishChinese.asmx" />
    </wsdl:port>
    <wsdl:port name="EnglishChineseHttpGet" binding="tns:EnglishChineseHttpGet">
      <http:address location="http://fy.webxml.com.cn/webservices/EnglishChinese.asmx" />
    </wsdl:port>
    <wsdl:port name="EnglishChineseHttpPost" binding="tns:EnglishChineseHttpPost">
      <http:address location="http://fy.webxml.com.cn/webservices/EnglishChinese.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>