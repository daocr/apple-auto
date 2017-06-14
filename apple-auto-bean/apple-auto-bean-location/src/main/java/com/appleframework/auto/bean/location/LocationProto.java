package com.appleframework.auto.bean.location;

public final class LocationProto {
	
	private LocationProto() {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
	}

	public interface ModelOrBuilder extends com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>required string account = 1;</code>
		 */
		boolean hasAccount();

		/**
		 * <code>required string account = 1;</code>
		 */
		java.lang.String getAccount();

		/**
		 * <code>required string account = 1;</code>
		 */
		com.google.protobuf.ByteString getAccountBytes();

		/**
		 * <code>required double latitude = 2;</code>
		 */
		boolean hasLatitude();

		/**
		 * <code>required double latitude = 2;</code>
		 */
		double getLatitude();

		/**
		 * <code>required double longitude = 3;</code>
		 */
		boolean hasLongitude();

		/**
		 * <code>required double longitude = 3;</code>
		 */
		double getLongitude();

		/**
		 * <code>required double altitude = 4;</code>
		 */
		boolean hasAltitude();

		/**
		 * <code>required double altitude = 4;</code>
		 */
		double getAltitude();

		/**
		 * <code>required double speed = 5;</code>
		 */
		boolean hasSpeed();

		/**
		 * <code>required double speed = 5;</code>
		 */
		double getSpeed();

		/**
		 * <code>required double direction = 6;</code>
		 */
		boolean hasDirection();

		/**
		 * <code>required double direction = 6;</code>
		 */
		double getDirection();

		/**
		 * <code>required int64 time = 7;</code>
		 */
		boolean hasTime();

		/**
		 * <code>required int64 time = 7;</code>
		 */
		long getTime();
	}

	/**
	 * Protobuf type {@code com.appleframework.auto.bean.location.Model}
	 */
	public static final class Model extends com.google.protobuf.GeneratedMessage implements ModelOrBuilder {
		private Model(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private Model(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final Model defaultInstance;

		public static Model getDefaultInstance() {
			return defaultInstance;
		}

		public Model getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		@SuppressWarnings("unused")
		private Model(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000001;
						account_ = bs;
						break;
					}
					case 17: {
						bitField0_ |= 0x00000002;
						latitude_ = input.readDouble();
						break;
					}
					case 25: {
						bitField0_ |= 0x00000004;
						longitude_ = input.readDouble();
						break;
					}
					case 33: {
						bitField0_ |= 0x00000008;
						altitude_ = input.readDouble();
						break;
					}
					case 41: {
						bitField0_ |= 0x00000010;
						speed_ = input.readDouble();
						break;
					}
					case 49: {
						bitField0_ |= 0x00000020;
						direction_ = input.readDouble();
						break;
					}
					case 56: {
						bitField0_ |= 0x00000040;
						time_ = input.readInt64();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return com.appleframework.auto.bean.location.LocationProto.internal_static_com_appleframework_auto_bean_location_Model_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return com.appleframework.auto.bean.location.LocationProto.internal_static_com_appleframework_auto_bean_location_Model_fieldAccessorTable
					.ensureFieldAccessorsInitialized(com.appleframework.auto.bean.location.LocationProto.Model.class,
							com.appleframework.auto.bean.location.LocationProto.Model.Builder.class);
		}

		public static com.google.protobuf.Parser<Model> PARSER = new com.google.protobuf.AbstractParser<Model>() {
			public Model parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Model(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<Model> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		public static final int ACCOUNT_FIELD_NUMBER = 1;
		private java.lang.Object account_;

		/**
		 * <code>required string account = 1;</code>
		 */
		public boolean hasAccount() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required string account = 1;</code>
		 */
		public java.lang.String getAccount() {
			java.lang.Object ref = account_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					account_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>required string account = 1;</code>
		 */
		public com.google.protobuf.ByteString getAccountBytes() {
			java.lang.Object ref = account_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				account_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int LATITUDE_FIELD_NUMBER = 2;
		private double latitude_;

		/**
		 * <code>required double latitude = 2;</code>
		 */
		public boolean hasLatitude() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>required double latitude = 2;</code>
		 */
		public double getLatitude() {
			return latitude_;
		}

		public static final int LONGITUDE_FIELD_NUMBER = 3;
		private double longitude_;

		/**
		 * <code>required double longitude = 3;</code>
		 */
		public boolean hasLongitude() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>required double longitude = 3;</code>
		 */
		public double getLongitude() {
			return longitude_;
		}

		public static final int ALTITUDE_FIELD_NUMBER = 4;
		private double altitude_;

		/**
		 * <code>required double altitude = 4;</code>
		 */
		public boolean hasAltitude() {
			return ((bitField0_ & 0x00000008) == 0x00000008);
		}

		/**
		 * <code>required double altitude = 4;</code>
		 */
		public double getAltitude() {
			return altitude_;
		}

		public static final int SPEED_FIELD_NUMBER = 5;
		private double speed_;

		/**
		 * <code>required double speed = 5;</code>
		 */
		public boolean hasSpeed() {
			return ((bitField0_ & 0x00000010) == 0x00000010);
		}

		/**
		 * <code>required double speed = 5;</code>
		 */
		public double getSpeed() {
			return speed_;
		}

		public static final int DIRECTION_FIELD_NUMBER = 6;
		private double direction_;

		/**
		 * <code>required double direction = 6;</code>
		 */
		public boolean hasDirection() {
			return ((bitField0_ & 0x00000020) == 0x00000020);
		}

		/**
		 * <code>required double direction = 6;</code>
		 */
		public double getDirection() {
			return direction_;
		}

		public static final int TIME_FIELD_NUMBER = 7;
		private long time_;

		/**
		 * <code>required int64 time = 7;</code>
		 */
		public boolean hasTime() {
			return ((bitField0_ & 0x00000040) == 0x00000040);
		}

		/**
		 * <code>required int64 time = 7;</code>
		 */
		public long getTime() {
			return time_;
		}

		private void initFields() {
			account_ = "";
			latitude_ = 0D;
			longitude_ = 0D;
			altitude_ = 0D;
			speed_ = 0D;
			direction_ = 0D;
			time_ = 0L;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			if (!hasAccount()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasLatitude()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasLongitude()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasAltitude()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasSpeed()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasDirection()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasTime()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeBytes(1, getAccountBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeDouble(2, latitude_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeDouble(3, longitude_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				output.writeDouble(4, altitude_);
			}
			if (((bitField0_ & 0x00000010) == 0x00000010)) {
				output.writeDouble(5, speed_);
			}
			if (((bitField0_ & 0x00000020) == 0x00000020)) {
				output.writeDouble(6, direction_);
			}
			if (((bitField0_ & 0x00000040) == 0x00000040)) {
				output.writeInt64(7, time_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getAccountBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, latitude_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, longitude_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(4, altitude_);
			}
			if (((bitField0_ & 0x00000010) == 0x00000010)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(5, speed_);
			}
			if (((bitField0_ & 0x00000020) == 0x00000020)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(6, direction_);
			}
			if (((bitField0_ & 0x00000040) == 0x00000040)) {
				size += com.google.protobuf.CodedOutputStream.computeInt64Size(7, time_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(
				com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(
				com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseDelimitedFrom(
				java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseDelimitedFrom(
				java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static com.appleframework.auto.bean.location.LocationProto.Model parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(com.appleframework.auto.bean.location.LocationProto.Model prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code com.appleframework.auto.bean.location.Model}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder>
				implements com.appleframework.auto.bean.location.LocationProto.ModelOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return com.appleframework.auto.bean.location.LocationProto.internal_static_com_appleframework_auto_bean_location_Model_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return com.appleframework.auto.bean.location.LocationProto.internal_static_com_appleframework_auto_bean_location_Model_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								com.appleframework.auto.bean.location.LocationProto.Model.class,
								com.appleframework.auto.bean.location.LocationProto.Model.Builder.class);
			}

			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				account_ = "";
				bitField0_ = (bitField0_ & ~0x00000001);
				latitude_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000002);
				longitude_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000004);
				altitude_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000008);
				speed_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000010);
				direction_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000020);
				time_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000040);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return com.appleframework.auto.bean.location.LocationProto.internal_static_com_appleframework_auto_bean_location_Model_descriptor;
			}

			public com.appleframework.auto.bean.location.LocationProto.Model getDefaultInstanceForType() {
				return com.appleframework.auto.bean.location.LocationProto.Model.getDefaultInstance();
			}

			public com.appleframework.auto.bean.location.LocationProto.Model build() {
				com.appleframework.auto.bean.location.LocationProto.Model result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public com.appleframework.auto.bean.location.LocationProto.Model buildPartial() {
				com.appleframework.auto.bean.location.LocationProto.Model result = new com.appleframework.auto.bean.location.LocationProto.Model(
						this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.account_ = account_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.latitude_ = latitude_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.longitude_ = longitude_;
				if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
					to_bitField0_ |= 0x00000008;
				}
				result.altitude_ = altitude_;
				if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
					to_bitField0_ |= 0x00000010;
				}
				result.speed_ = speed_;
				if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
					to_bitField0_ |= 0x00000020;
				}
				result.direction_ = direction_;
				if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
					to_bitField0_ |= 0x00000040;
				}
				result.time_ = time_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof com.appleframework.auto.bean.location.LocationProto.Model) {
					return mergeFrom((com.appleframework.auto.bean.location.LocationProto.Model) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(com.appleframework.auto.bean.location.LocationProto.Model other) {
				if (other == com.appleframework.auto.bean.location.LocationProto.Model.getDefaultInstance())
					return this;
				if (other.hasAccount()) {
					bitField0_ |= 0x00000001;
					account_ = other.account_;
					onChanged();
				}
				if (other.hasLatitude()) {
					setLatitude(other.getLatitude());
				}
				if (other.hasLongitude()) {
					setLongitude(other.getLongitude());
				}
				if (other.hasAltitude()) {
					setAltitude(other.getAltitude());
				}
				if (other.hasSpeed()) {
					setSpeed(other.getSpeed());
				}
				if (other.hasDirection()) {
					setDirection(other.getDirection());
				}
				if (other.hasTime()) {
					setTime(other.getTime());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasAccount()) {

					return false;
				}
				if (!hasLatitude()) {

					return false;
				}
				if (!hasLongitude()) {

					return false;
				}
				if (!hasAltitude()) {

					return false;
				}
				if (!hasSpeed()) {

					return false;
				}
				if (!hasDirection()) {

					return false;
				}
				if (!hasTime()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				com.appleframework.auto.bean.location.LocationProto.Model parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (com.appleframework.auto.bean.location.LocationProto.Model) e
							.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private java.lang.Object account_ = "";

			/**
			 * <code>required string account = 1;</code>
			 */
			public boolean hasAccount() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required string account = 1;</code>
			 */
			public java.lang.String getAccount() {
				java.lang.Object ref = account_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					if (bs.isValidUtf8()) {
						account_ = s;
					}
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>required string account = 1;</code>
			 */
			public com.google.protobuf.ByteString getAccountBytes() {
				java.lang.Object ref = account_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					account_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>required string account = 1;</code>
			 */
			public Builder setAccount(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				account_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required string account = 1;</code>
			 */
			public Builder clearAccount() {
				bitField0_ = (bitField0_ & ~0x00000001);
				account_ = getDefaultInstance().getAccount();
				onChanged();
				return this;
			}

			/**
			 * <code>required string account = 1;</code>
			 */
			public Builder setAccountBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				account_ = value;
				onChanged();
				return this;
			}

			private double latitude_;

			/**
			 * <code>required double latitude = 2;</code>
			 */
			public boolean hasLatitude() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>required double latitude = 2;</code>
			 */
			public double getLatitude() {
				return latitude_;
			}

			/**
			 * <code>required double latitude = 2;</code>
			 */
			public Builder setLatitude(double value) {
				bitField0_ |= 0x00000002;
				latitude_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required double latitude = 2;</code>
			 */
			public Builder clearLatitude() {
				bitField0_ = (bitField0_ & ~0x00000002);
				latitude_ = 0D;
				onChanged();
				return this;
			}

			private double longitude_;

			/**
			 * <code>required double longitude = 3;</code>
			 */
			public boolean hasLongitude() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>required double longitude = 3;</code>
			 */
			public double getLongitude() {
				return longitude_;
			}

			/**
			 * <code>required double longitude = 3;</code>
			 */
			public Builder setLongitude(double value) {
				bitField0_ |= 0x00000004;
				longitude_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required double longitude = 3;</code>
			 */
			public Builder clearLongitude() {
				bitField0_ = (bitField0_ & ~0x00000004);
				longitude_ = 0D;
				onChanged();
				return this;
			}

			private double altitude_;

			/**
			 * <code>required double altitude = 4;</code>
			 */
			public boolean hasAltitude() {
				return ((bitField0_ & 0x00000008) == 0x00000008);
			}

			/**
			 * <code>required double altitude = 4;</code>
			 */
			public double getAltitude() {
				return altitude_;
			}

			/**
			 * <code>required double altitude = 4;</code>
			 */
			public Builder setAltitude(double value) {
				bitField0_ |= 0x00000008;
				altitude_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required double altitude = 4;</code>
			 */
			public Builder clearAltitude() {
				bitField0_ = (bitField0_ & ~0x00000008);
				altitude_ = 0D;
				onChanged();
				return this;
			}

			private double speed_;

			/**
			 * <code>required double speed = 5;</code>
			 */
			public boolean hasSpeed() {
				return ((bitField0_ & 0x00000010) == 0x00000010);
			}

			/**
			 * <code>required double speed = 5;</code>
			 */
			public double getSpeed() {
				return speed_;
			}

			/**
			 * <code>required double speed = 5;</code>
			 */
			public Builder setSpeed(double value) {
				bitField0_ |= 0x00000010;
				speed_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required double speed = 5;</code>
			 */
			public Builder clearSpeed() {
				bitField0_ = (bitField0_ & ~0x00000010);
				speed_ = 0D;
				onChanged();
				return this;
			}

			private double direction_;

			/**
			 * <code>required double direction = 6;</code>
			 */
			public boolean hasDirection() {
				return ((bitField0_ & 0x00000020) == 0x00000020);
			}

			/**
			 * <code>required double direction = 6;</code>
			 */
			public double getDirection() {
				return direction_;
			}

			/**
			 * <code>required double direction = 6;</code>
			 */
			public Builder setDirection(double value) {
				bitField0_ |= 0x00000020;
				direction_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required double direction = 6;</code>
			 */
			public Builder clearDirection() {
				bitField0_ = (bitField0_ & ~0x00000020);
				direction_ = 0D;
				onChanged();
				return this;
			}

			private long time_;

			/**
			 * <code>required int64 time = 7;</code>
			 */
			public boolean hasTime() {
				return ((bitField0_ & 0x00000040) == 0x00000040);
			}

			/**
			 * <code>required int64 time = 7;</code>
			 */
			public long getTime() {
				return time_;
			}

			/**
			 * <code>required int64 time = 7;</code>
			 */
			public Builder setTime(long value) {
				bitField0_ |= 0x00000040;
				time_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required int64 time = 7;</code>
			 */
			public Builder clearTime() {
				bitField0_ = (bitField0_ & ~0x00000040);
				time_ = 0L;
				onChanged();
				return this;
			}

		}

		static {
			defaultInstance = new Model(true);
			defaultInstance.initFields();
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_com_appleframework_auto_bean_location_Model_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_com_appleframework_auto_bean_location_Model_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = { "\n\016Location.proto\022%com.appleframework.aut"
				+ "o.bean.location\"\177\n\005Model\022\017\n\007account\030\001 \002("
				+ "\t\022\020\n\010latitude\030\002 \002(\001\022\021\n\tlongitude\030\003 \002(\001\022\020"
				+ "\n\010altitude\030\004 \002(\001\022\r\n\005speed\030\005 \002(\001\022\021\n\tdirec"
				+ "tion\030\006 \002(\001\022\014\n\004time\030\007 \002(\003B\017B\rLocationProt" + "o" };
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
		internal_static_com_appleframework_auto_bean_location_Model_descriptor = getDescriptor().getMessageTypes()
				.get(0);
		internal_static_com_appleframework_auto_bean_location_Model_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
				internal_static_com_appleframework_auto_bean_location_Model_descriptor, new java.lang.String[] {
						"Account", "Latitude", "Longitude", "Altitude", "Speed", "Direction", "Time", });
	}

}
