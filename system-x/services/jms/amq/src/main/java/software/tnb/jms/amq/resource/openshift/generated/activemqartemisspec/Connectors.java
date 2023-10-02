package software.tnb.jms.amq.resource.openshift.generated.activemqartemisspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"enabledCipherSuites","enabledProtocols","expose","host","keyStoreProvider","name","needClientAuth","port","sniHost","sslEnabled","sslProvider","sslSecret","trustStoreProvider","trustStoreType","type","verifyHost","wantClientAuth"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Connectors implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Comma separated list of cipher suites used for SSL communication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabledCipherSuites")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Comma separated list of cipher suites used for SSL communication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String enabledCipherSuites;

    public String getEnabledCipherSuites() {
        return enabledCipherSuites;
    }

    public void setEnabledCipherSuites(String enabledCipherSuites) {
        this.enabledCipherSuites = enabledCipherSuites;
    }

    /**
     * Comma separated list of protocols used for SSL communication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabledProtocols")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Comma separated list of protocols used for SSL communication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String enabledProtocols;

    public String getEnabledProtocols() {
        return enabledProtocols;
    }

    public void setEnabledProtocols(String enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
    }

    /**
     * Whether or not to expose this connector
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expose")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether or not to expose this connector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean expose;

    public Boolean getExpose() {
        return expose;
    }

    public void setExpose(Boolean expose) {
        this.expose = expose;
    }

    /**
     * Hostname or IP to connect to
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostname or IP to connect to")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Provider used for the keystore; "SUN", "SunJCE", etc. Default is null
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Provider used for the keystore; \"SUN\", \"SunJCE\", etc. Default is null")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String keyStoreProvider;

    public String getKeyStoreProvider() {
        return keyStoreProvider;
    }

    public void setKeyStoreProvider(String keyStoreProvider) {
        this.keyStoreProvider = keyStoreProvider;
    }

    /**
     * The name of the connector
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the connector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Tells a client connecting to this connector that 2-way SSL is required. This property takes precedence over wantClientAuth.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("needClientAuth")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tells a client connecting to this connector that 2-way SSL is required. This property takes precedence over wantClientAuth.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean needClientAuth;

    public Boolean getNeedClientAuth() {
        return needClientAuth;
    }

    public void setNeedClientAuth(Boolean needClientAuth) {
        this.needClientAuth = needClientAuth;
    }

    /**
     * Port number
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port number")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * A regular expression used to match the server_name extension on incoming SSL connections. If the name doesn't match then the connection to the acceptor will be rejected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sniHost")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A regular expression used to match the server_name extension on incoming SSL connections. If the name doesn't match then the connection to the acceptor will be rejected.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sniHost;

    public String getSniHost() {
        return sniHost;
    }

    public void setSniHost(String sniHost) {
        this.sniHost = sniHost;
    }

    /**
     * Whether or not to enable SSL on this port
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslEnabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription(" Whether or not to enable SSL on this port")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean sslEnabled;

    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    /**
     * Used to change the SSL Provider between JDK and OPENSSL. The default is JDK.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Used to change the SSL Provider between JDK and OPENSSL. The default is JDK.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sslProvider;

    public String getSslProvider() {
        return sslProvider;
    }

    public void setSslProvider(String sslProvider) {
        this.sslProvider = sslProvider;
    }

    /**
     * Name of the secret to use for ssl information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sslSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the secret to use for ssl information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sslSecret;

    public String getSslSecret() {
        return sslSecret;
    }

    public void setSslSecret(String sslSecret) {
        this.sslSecret = sslSecret;
    }

    /**
     * Provider used for the truststore; "SUN", "SunJCE", etc. Default in broker is null
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreProvider")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Provider used for the truststore; \"SUN\", \"SunJCE\", etc. Default in broker is null")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String trustStoreProvider;

    public String getTrustStoreProvider() {
        return trustStoreProvider;
    }

    public void setTrustStoreProvider(String trustStoreProvider) {
        this.trustStoreProvider = trustStoreProvider;
    }

    /**
     * Type of truststore being used; "JKS", "JCEKS", "PKCS12", etc. Default in broker is "JKS"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreType")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type of truststore being used; \"JKS\", \"JCEKS\", \"PKCS12\", etc. Default in broker is \"JKS\"")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String trustStoreType;

    public String getTrustStoreType() {
        return trustStoreType;
    }

    public void setTrustStoreType(String trustStoreType) {
        this.trustStoreType = trustStoreType;
    }

    /**
     * The type either tcp or vm
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The type either tcp or vm")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The CN of the connecting client's SSL certificate will be compared to its hostname to verify they match. This is useful only for 2-way SSL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verifyHost")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The CN of the connecting client's SSL certificate will be compared to its hostname to verify they match. This is useful only for 2-way SSL.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean verifyHost;

    public Boolean getVerifyHost() {
        return verifyHost;
    }

    public void setVerifyHost(Boolean verifyHost) {
        this.verifyHost = verifyHost;
    }

    /**
     * Tells a client connecting to this connector that 2-way SSL is requested but not required. Overridden by needClientAuth.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("wantClientAuth")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Tells a client connecting to this connector that 2-way SSL is requested but not required. Overridden by needClientAuth.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean wantClientAuth;

    public Boolean getWantClientAuth() {
        return wantClientAuth;
    }

    public void setWantClientAuth(Boolean wantClientAuth) {
        this.wantClientAuth = wantClientAuth;
    }
}

