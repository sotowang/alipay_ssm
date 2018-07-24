//package com.alipay.controller;
//public class AlipayController {
//    //生成有二维码，可供扫码支付的页面
//    @RequestMapping(value = "aliPay")
//    public String aliPay(HttpServletResponse response,ModelMap map,String chapterId,HttpServletRequest request,
//                         String WIDout_trade_no,String WIDtotal_amount,String WIDsubject,String WIDbody) throws IOException, AlipayApiException{
////      String a,String urlName,String couName....+"&a="+a+"&urlName="+urlName+"&couName="+couName
//        //获得初始化的AlipayClient
//        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
//
//        //设置请求参数
//        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
//        alipayRequest.setReturnUrl(AlipayConfig.return_url+"?chapterId="+chapterId);
//        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
//        //付款ID，必填
//        String out_trade_no = WIDout_trade_no;
//        //付款金额，必填
//        String total_amount = WIDtotal_amount;
//        total_amount=URLDecoder.decode(total_amount,"UTF-8");//转码
//        //订单名称，必填
//        String subject = WIDsubject;
//        subject=URLDecoder.decode(subject,"UTF-8");
//        //商品描述，可空
//        String body = WIDbody;
//
//        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
//                + "\"total_amount\":\""+ total_amount +"\","
//                + "\"subject\":\""+ subject +"\","
//                + "\"body\":\""+ body +"\","
//                + "\"timeout_express\":\"1m\","
//                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
//        //请求
//        String result = alipayClient.pageExecute(alipayRequest).getBody();
//        response.setContentType("text/html; charset=utf-8");
//        PrintWriter out = response.getWriter();
//        out.println(result);
//        return null;
//    }
//
//}
