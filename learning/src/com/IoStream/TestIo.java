package com.IoStream;

/**
 * IO 流基本元素：
 * 1. InputStream
 * 2. OutputStream
 * 3. Reader
 * 4. Writer
 *
 * Io 流分类：
 * 1. 按照方向： 输入，输出
 * 2. 按照数据处理方式： 字节流 字符流
 *
 * IO 流的角色分
 * 节点流： 文件流
 * 处理流： 缓冲流，序列化与反序列化
 * 常见IO流：
 * 1、文件IO流
 *  1 FileInputStream  ---> 读任意文件
 *  2 FileOutputStream  ---> 数据写入任意文件
 *  3 FileReader  ---> 读纯文本文件
 *  4 FileWriter  ---> 数据写入纯文本文件
 * 2、缓冲流
 *  1 BufferInputStream  --->  InputStream 系列的IO流增加缓冲
 *  2 BufferOutputStream  ---> OutStream 系列的IO流增加缓冲
 *  3 BufferReader  ---> Reader 系列的IO流增加缓冲
 *  4 BufferWriter  ---> Writer 系列的IO流增加缓冲
 * 3、数据流
 *  1 DataInputStream  ---> 数据字节流输入
 *  2 DataOutputStream  ---> 数据字节流输出
 */
public class TestIo {


}
