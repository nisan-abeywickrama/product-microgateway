// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/jwt_generator.proto

package org.wso2.gateway.discovery.config.enforcer;

public interface JWTGeneratorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.JWTGenerator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable = 1;</code>
   * @return The enable.
   */
  boolean getEnable();

  /**
   * <code>string encoding = 2;</code>
   * @return The encoding.
   */
  java.lang.String getEncoding();
  /**
   * <code>string encoding = 2;</code>
   * @return The bytes for encoding.
   */
  com.google.protobuf.ByteString
      getEncodingBytes();

  /**
   * <code>string claim_dialect = 3;</code>
   * @return The claimDialect.
   */
  java.lang.String getClaimDialect();
  /**
   * <code>string claim_dialect = 3;</code>
   * @return The bytes for claimDialect.
   */
  com.google.protobuf.ByteString
      getClaimDialectBytes();

  /**
   * <code>bool convert_dialect = 4;</code>
   * @return The convertDialect.
   */
  boolean getConvertDialect();

  /**
   * <code>string header = 5;</code>
   * @return The header.
   */
  java.lang.String getHeader();
  /**
   * <code>string header = 5;</code>
   * @return The bytes for header.
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <code>string signing_algorithm = 6;</code>
   * @return The signingAlgorithm.
   */
  java.lang.String getSigningAlgorithm();
  /**
   * <code>string signing_algorithm = 6;</code>
   * @return The bytes for signingAlgorithm.
   */
  com.google.protobuf.ByteString
      getSigningAlgorithmBytes();

  /**
   * <code>bool enable_user_claims = 7;</code>
   * @return The enableUserClaims.
   */
  boolean getEnableUserClaims();

  /**
   * <code>string gateway_generator_impl = 8;</code>
   * @return The gatewayGeneratorImpl.
   */
  java.lang.String getGatewayGeneratorImpl();
  /**
   * <code>string gateway_generator_impl = 8;</code>
   * @return The bytes for gatewayGeneratorImpl.
   */
  com.google.protobuf.ByteString
      getGatewayGeneratorImplBytes();

  /**
   * <code>string claims_extractor_impl = 9;</code>
   * @return The claimsExtractorImpl.
   */
  java.lang.String getClaimsExtractorImpl();
  /**
   * <code>string claims_extractor_impl = 9;</code>
   * @return The bytes for claimsExtractorImpl.
   */
  com.google.protobuf.ByteString
      getClaimsExtractorImplBytes();

  /**
   * <code>string public_certificate_path = 10;</code>
   * @return The publicCertificatePath.
   */
  java.lang.String getPublicCertificatePath();
  /**
   * <code>string public_certificate_path = 10;</code>
   * @return The bytes for publicCertificatePath.
   */
  com.google.protobuf.ByteString
      getPublicCertificatePathBytes();

  /**
   * <code>string private_key_path = 11;</code>
   * @return The privateKeyPath.
   */
  java.lang.String getPrivateKeyPath();
  /**
   * <code>string private_key_path = 11;</code>
   * @return The bytes for privateKeyPath.
   */
  com.google.protobuf.ByteString
      getPrivateKeyPathBytes();
}
